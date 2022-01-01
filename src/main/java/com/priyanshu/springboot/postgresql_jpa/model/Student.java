package com.priyanshu.springboot.postgresql_jpa.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String uid;
    private String name;
    private String email;
    @Transient
    private String collageEmail;
    private LocalDate dob;
    @Transient
    private Integer age;

    public Student() {
    }

    public Student(String uid, String name, String email, LocalDate dob) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Student(Long id, String uid, String name, String email, LocalDate dob) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollageEmail() {
        return uid + "@cuchd.in";
    }

    public void setCollageEmail(String collageEmail) {
        this.collageEmail = collageEmail;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", collageEmail='" + collageEmail + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
