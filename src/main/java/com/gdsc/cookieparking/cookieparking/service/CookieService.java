package com.gdsc.cookieparking.cookieparking.service;

import com.gdsc.cookieparking.cookieparking.domain.Cookie;
import com.gdsc.cookieparking.cookieparking.domain.User;
import com.gdsc.cookieparking.cookieparking.repository.CookieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookieService {

    @Autowired
    private CookieRepository cookieRepository;

    public Cookie addCookie(String userId, String url, String title, String text) {
        Cookie cookie = Cookie.builder()
                .userId(userId)
                .url(url)
                .title(title)
                .text(text)
                .build();

        return cookieRepository.save(cookie);
    }

    public List<Cookie> getCookieList(String userId) {
        return cookieRepository.findAllByUserId(userId);

    }
}


