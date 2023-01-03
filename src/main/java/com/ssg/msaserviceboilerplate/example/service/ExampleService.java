package com.ssg.msaserviceboilerplate.example.service;

import com.ssg.msaserviceboilerplate.example.dto.request.ExampleRequest;
import com.ssg.msaserviceboilerplate.example.dto.response.ExampleResponse;
import com.ssg.msaserviceboilerplate.example.entity.Example;
import com.ssg.msaserviceboilerplate.example.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleRepository exampleRepository;

    public ExampleResponse create(ExampleRequest request) {
        exampleRepository.save(Example.newInstance());
        return ExampleResponse.of();
    }
}
