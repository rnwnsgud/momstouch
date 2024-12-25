package com.rnwnsgud.momstouch.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    WRONG_KIOSK_COUNT(BAD_REQUEST, "잘못된 수량의 키오스크 주문 수량입니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
