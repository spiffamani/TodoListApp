package org.TodoList.services;

import org.TodoList.data.model.Task;
import org.TodoList.data.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {

        return taskRepository.save(task);
    }
@Override
    public Task updateTask(String id, Task updateTask) {
        Task existingTask = taskRepository.findById(id).orElse(null);
        if (existingTask != null) {
        existingTask.setTitle(updateTask.getTitle());
        existingTask.setDescription(updateTask.getDescription());
        existingTask.setCompleted(updateTask.isCompleted());
        return taskRepository.save(existingTask);
    }else {
            return null;
        }
    }
@Override
    public void deleteTask(String id){
        taskRepository.deleteById(id);
    }

@Override
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
}




}
