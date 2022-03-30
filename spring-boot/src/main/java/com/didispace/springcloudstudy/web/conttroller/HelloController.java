package com.didispace.springcloudstudy.web.conttroller;

import com.didispace.springcloudstudy.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @Autowired
    private Book book;

    @RequestMapping("/hello")
    public String index() {
        log.info(book.getName());
        return "Hello World";
    }
}
