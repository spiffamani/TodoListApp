package org.TodoListTest.services;

import org.TodoList.data.model.Task;
import org.TodoList.services.TaskServiceImpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TaskServiceTest {

    private TaskServiceImpl taskService;

    @Autowired
    void setUp() {
        taskService = new TaskServiceImpl();
    }

    @Test
    void testCreateTask() {
        Task task = new Task();
        task.setTitle("Demo Task");
        task.setDescription("Demo Description");
        task.setCompleted(false);
        task.setCreatedAt(LocalDate.now());

        Task saved = taskService.createATask(task);
        assertNotNull(saved.getId());
        assertEquals("Demo Task", saved.getTitle());
    }
}
