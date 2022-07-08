package com.gdsc.cookieparking.cookieparking.controller;

import com.gdsc.cookieparking.cookieparking.domain.Cookie;
import com.gdsc.cookieparking.cookieparking.service.CookieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CookieController {

    @Autowired
    CookieService cookieService;

    @GetMapping("users/{userId}/cookies")
    public List<Cookie> list(@PathVariable("userId") String userId) {
        return cookieService.getCookieList(userId);
    }
}
