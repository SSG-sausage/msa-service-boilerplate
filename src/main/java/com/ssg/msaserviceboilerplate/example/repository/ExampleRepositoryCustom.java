package com.ssg.msaserviceboilerplate.example.repository;

import com.ssg.msaserviceboilerplate.example.entity.Example;

public interface ExampleRepositoryCustom {

    Example findExampleById(Long id);
}
