package com.crud.operation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.operation.models.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>{
	
	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String title);

}
