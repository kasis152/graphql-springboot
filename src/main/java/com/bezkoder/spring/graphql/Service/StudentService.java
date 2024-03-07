package com.bezkoder.spring.graphql.Service;

import com.bezkoder.spring.graphql.model.Student;
import com.bezkoder.spring.graphql.repository.StudentRepo;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Iterable<Student> getAllStudent(){
        System.out.println("From Repo0 ->"+studentRepo.findAll().toString());
        List<DBObject> students = mongoTemplate.findAll(DBObject.class, "student");
        for (DBObject student : students) {
            System.out.println(student);
        }
        return studentRepo.findAll();
    }

}
