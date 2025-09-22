package org.TodoList.data.repository;

import org.TodoList.data.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {


}
