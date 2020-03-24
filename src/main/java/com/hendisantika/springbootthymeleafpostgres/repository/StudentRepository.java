package com.hendisantika.springbootthymeleafpostgres.repository;

import com.hendisantika.springbootthymeleafpostgres.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/03/20
 * Time: 06.04
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
}