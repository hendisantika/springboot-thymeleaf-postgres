package com.hendisantika.springbootthymeleafpostgres.controller;

import com.hendisantika.springbootthymeleafpostgres.entity.Student;
import com.hendisantika.springbootthymeleafpostgres.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/")
    public String createHome(Model model) {
        model.addAttribute("student", studentRepository.findAll());
        return "home";
    }

    @GetMapping(value = "/create")
    public String create1(Model model) {
        model.addAttribute("student", new Student());
        return "formStudent";
    }

    @PostMapping(value = "/create")
    public String create2(Model model, Student student) {
        model.addAttribute("student", studentRepository.save(student));
        return "redirect:/";
    }

    @GetMapping(value = "/edit/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        model.addAttribute("student", studentRepository.getOne(id));
        return "formStudent";
    }

    @GetMapping(value = "/hapus/{id}")
    public String hapusStudent(@PathVariable Integer id) {
        studentRepository.deleteById(id);
        return "redirect:/";
    }
}
