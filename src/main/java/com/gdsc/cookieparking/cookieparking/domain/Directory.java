package com.gdsc.cookieparking.cookieparking.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Directory {

    @Id
    @GeneratedValue
    private Long id;

    private String userId;

    private String name;

    private String imageUrl;

    private String emoji;

    private List<Cookie> cookie;
}
