package com.estudo.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.todolist.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	
}
