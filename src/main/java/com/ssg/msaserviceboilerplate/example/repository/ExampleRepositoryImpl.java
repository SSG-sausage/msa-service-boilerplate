package com.ssg.msaserviceboilerplate.example.repository;

import static com.ssg.msaserviceboilerplate.example.entity.QExample.example;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssg.msaserviceboilerplate.example.entity.Example;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ExampleRepositoryImpl implements ExampleRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public Example findExampleById(Long id) {
        return queryFactory
                .selectFrom(example)
                .where(
                        example.id.eq(id)
                )
                .fetchOne();
    }
}
