package org.TodoList.controller;

import org.TodoList.data.model.Task;
import org.TodoList.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task createATask(@RequestBody Task task){
        return taskService.createATask(task);
    }
    @GetMapping
    public List<Task> getTasks(){

        return taskService.getTasks();
    }
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable String id, @RequestBody Task task){


        return taskService.updateTask(id,task);
    }
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id){

        taskService.deleteTask(id);
    }
}

