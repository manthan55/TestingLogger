package org.manthan.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Post {
    private String author;
    private String title;
    private String content;
    private Date publishDate;
}
