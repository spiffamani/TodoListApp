package org.TodoList.services;

import org.TodoList.data.model.Task;

import java.util.List;


public interface TaskService {
    Task createATask(Task task);
    Task updateTask(String id , Task task);
    void deleteTask(String Id);
    List<Task> getTasks();
}
