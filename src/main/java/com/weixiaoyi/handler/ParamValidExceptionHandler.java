package com.weixiaoyi.handler;

import com.weixiaoyi.vo.resp.ResultVo;
import com.weixiaoyi.vo.resp.ValidErrorVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ParamValidExceptionHandler
 * @Description 参数校验异常拦截
 * @Author xxx
 * History:
 * 版本号   作者     日期      操作
 * 1.0     ylWei   2019/7/18   新建
 */
@ControllerAdvice
@Slf4j
@ResponseBody
public class ParamValidExceptionHandler {

    /**
     * 参数校验未通过 进行异常拦截
     * 将异常内容封装进行自定义封装 并且返回
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    public ResultVo<List<ValidErrorVo>> validExceptionHandler(BindException exception) {
        BindingResult bindingResult = exception.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();

        List<ValidErrorVo> errorMessage = new ArrayList<>();
        for (FieldError error : fieldErrors) {
            ValidErrorVo validErrorVo = new ValidErrorVo();
            validErrorVo.setField(error.getField());
            validErrorVo.setErrorMessage(error.getDefaultMessage());
            errorMessage.add(validErrorVo);
        }
        ResultVo<List<ValidErrorVo>> resultVo = new ResultVo<>();
        resultVo.setCode("10000");
        resultVo.setDesc("参数校验失败");
        resultVo.setData(errorMessage);
        return resultVo;
    }

}
