package com.arts.service.enums;

import com.gepholding.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 工具类错误码枚举类
 * <p>
 * 1.
 * </p>
 *
 * @author : system
 * @version : 1.0.0
 * @date : 2019-07-19 16:03:12
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum implements ErrorCode {
    ;

    /**
    * 错误码
    */
    private String errorCode;

    /**
    * 异常描述
    */
    private String errorDesc;

    @Override
    public void setErrorDesc(String errorMsg) {
        this.errorDesc = errorMsg;
    }
}