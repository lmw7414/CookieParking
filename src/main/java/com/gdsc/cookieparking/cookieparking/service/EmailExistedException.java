package com.gdsc.cookieparking.cookieparking.service;

public class EmailExistedException extends RuntimeException{

    EmailExistedException(String email) {
        super("이미 존재하는 이메일: " + email);
    }
}
