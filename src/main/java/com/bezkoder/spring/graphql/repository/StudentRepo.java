package com.bezkoder.spring.graphql.repository;


import com.bezkoder.spring.graphql.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//indicate that this repository is intended for managing entities of type Student, and the type of the identifier for the Student entity is Integer.
//MongoRepository is a part of the Spring Data MongoDB library, and it provides basic CRUD (Create, Read, Update, Delete) operations for working with MongoDB databases.
@Repository
public interface StudentRepo extends MongoRepository <Student,Integer> {
}

//@Repository
//public interface StudentRepo1 extends MongoRepository <DBObject,Integer> {
//}
