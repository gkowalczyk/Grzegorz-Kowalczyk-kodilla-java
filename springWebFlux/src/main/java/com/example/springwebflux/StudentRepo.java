package com.example.springwebflux;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

interface StudentRepo extends ReactiveMongoRepository<Student, String> {
}
