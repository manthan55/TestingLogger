package org.manthan;

import org.manthan.models.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.Date;

public class Main {
//    https://www.baeldung.com/slf4j-with-log4j2-logback
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.debug("Debug log message");
        LOG.info("Info log message");
        LOG.error("Error log message");

        Post p = new Post();
        p.setAuthor("manthan");
        p.setTitle("engineering at google");
        p.setContent("scaling to billions");
        p.setPublishDate(Date.from(Instant.now()));

        LOG.info(p.toString());

        System.out.println("Hello world!");
    }
}