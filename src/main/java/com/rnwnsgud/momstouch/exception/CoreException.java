package com.rnwnsgud.momstouch.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CoreException extends RuntimeException{

    private ErrorCode errorCode;
}
