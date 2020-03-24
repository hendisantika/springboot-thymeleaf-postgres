package com.hendisantika.springbootthymeleafpostgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/03/20
 * Time: 06.03
 */
@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String jurusan;

    @Version
    @Column(columnDefinition = "") //integer DEFAULT 0
    private Integer version;

    public Student(String name, String jurusan) {
        this.name = name;
        this.jurusan = jurusan;
    }
}
