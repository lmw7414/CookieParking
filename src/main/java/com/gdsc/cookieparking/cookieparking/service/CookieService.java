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

    public Cookie addCookie(String userId, String url) {
        Cookie cookie = Cookie.builder()
                .userId(userId)
                .url(url)
                .build();

        cookie.setTitle(makeTitle(url));
        cookie.setText(makeText(url));
        return cookieRepository.save(cookie);
    }

    public Cookie updateCookie(Long id, String title, String text) {
        //TODO : DB에서 쿠키 id로 찾아서 쿠키 가져오고 title이랑 text 변경
        Cookie cookie = cookieRepository.findById(id).orElse(null);

        cookie.setTitle(title);
        cookie.setText(text);
        return cookie;
    }



    public List<Cookie> getCookieList(String userId) {
        return cookieRepository.findAllByUserId(userId);

    }

    public String makeTitle(String url) {
        return null;
    }

    public String makeText(String url) {
        return null;
    }


}


