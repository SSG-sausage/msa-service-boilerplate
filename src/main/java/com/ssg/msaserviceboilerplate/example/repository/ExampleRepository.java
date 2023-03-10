package com.ssg.msaserviceboilerplate.example.repository;

import com.ssg.msaserviceboilerplate.example.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, Long>, ExampleRepositoryCustom {

}
