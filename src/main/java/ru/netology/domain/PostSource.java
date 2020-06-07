package ru.netology.domain;

import lombok.Data;

@Data
public class PostSource {
    private String type;
    private String platform;
    private String data;
    private String url;
}
