package com.rnwnsgud.momstouch.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    WRONG_MENU_OPTION(BAD_REQUEST, "잘못된 형식의 메뉴 옵션입니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
