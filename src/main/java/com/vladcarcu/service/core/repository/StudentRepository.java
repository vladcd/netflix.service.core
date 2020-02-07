package com.vladcarcu.service.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.vladcarcu.service.core.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @RestResource(rel = "byname", path = "byname")
    List<Student> findAllByNameContainsIgnoreCase(String name);
}
