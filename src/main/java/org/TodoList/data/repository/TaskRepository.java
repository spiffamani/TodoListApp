package org.TodoList.data.repository;


import org.TodoList.data.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository <Task, String> {

}
