package com.gdsc.cookieparking.cookieparking.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Cookie {

    @Id
    @GeneratedValue
    private Long id;

    private String userId;

    private String url;

    private String title;

    private String text;
}
