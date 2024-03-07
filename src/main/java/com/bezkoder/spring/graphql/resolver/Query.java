package com.bezkoder.spring.graphql.resolver;

import com.bezkoder.spring.graphql.model.Student;
import com.bezkoder.spring.graphql.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import com.bezkoder.spring.graphql.model.Author;
//import com.bezkoder.spring.graphql.model.Tutorial;
//import com.bezkoder.spring.graphql.repository.AuthorRepository;
//import com.bezkoder.spring.graphql.repository.TutorialRepository;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;

import java.util.Collections;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	StudentRepo studentRepo;
//	private AuthorRepository authorRepository;
//	private TutorialRepository tutorialRepository;
//
//	GraphQLScalarType longScalar =
//      ExtendedScalars.newAliasedScalar("Long")
//          .aliasedScalar(ExtendedScalars.GraphQLLong)
//          .build();
//
//	@Autowired
//	public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
//		this.authorRepository = authorRepository;
//		this.tutorialRepository = tutorialRepository;
//	}
//
//	public Iterable<Author> findAllAuthors() {
//		System.out.println("---inside resolver findAllAuthors---");
//		return authorRepository.findAll();
//	}

	public Iterable<Student> getAllStudents() {
		System.out.println("---inside resolver getAllStudents---");
		return studentRepo.findAll();
//		return Collections.emptyList();
	}
//	public Iterable<Tutorial> findAllTutorials() {
//		return tutorialRepository.findAll();
//	}
//
//	public long countAuthors() {
//		return authorRepository.count();
//	}
//
//	public long countTutorials() {
//		return tutorialRepository.count();
//	}

}
