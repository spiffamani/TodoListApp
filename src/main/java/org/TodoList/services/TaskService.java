package org.TodoList.services;

import org.TodoList.data.model.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    List<Task> getAllTasks();
    Task updateTask(String id, Task updateTask);
    void deleteTask(String id);


}
