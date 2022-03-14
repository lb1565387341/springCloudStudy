package com.didispace.springcloudstudy.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Book {
    /*
    @Value 注解加载属性值的时候可以支持两种表达式来进行配置， 如下所示。
    • 一种是上面介绍的 PlaceHolder 方式， 格式为$｛．．．｝， 大括号内为 PlaceHolder。
    • 另一种是使用SpEL 表达式 (Spring Expression Language), 格式为＃｛．．．｝， 大括号内为 SpEL 表达式。
    */
    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;
}
