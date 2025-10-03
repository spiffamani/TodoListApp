package org.TodoList.services;

import org.TodoList.data.model.Task;
import org.TodoList.data.repository.TaskRepository;
import org.TodoList.exceptions.TaskNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createATask(Task createTask) {

        return taskRepository.save(createTask);
    }

    @Override
    public Task updateTask(String id, Task task) {
        return taskRepository.findById(id)
        .map(existingTask -> {
        existingTask.setTitle(task.getTitle());
        existingTask.setDescription(task.getDescription());
        existingTask.setCompleted(task.isCompleted());
        existingTask.setUpdatedAt(LocalDate.now());
        return taskRepository.save(existingTask);
    }).orElse(null);
    }

    @Override
    public void deleteTask(String id) {

        taskRepository.deleteById(id);
    }

    @Override
    public List<Task> getTasks() {
        List<Task> tasks = taskRepository.findAll();
        if(tasks.isEmpty()){
            throw new TaskNotFoundException("No tasks found");
        }
        return tasks;
    }
}

