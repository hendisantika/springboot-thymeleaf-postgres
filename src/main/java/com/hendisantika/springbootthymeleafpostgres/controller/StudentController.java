package com.hendisantika.springbootthymeleafpostgres.controller;

import com.hendisantika.springbootthymeleafpostgres.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/03/20
 * Time: 06.11
 */
@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
}
