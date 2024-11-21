package it.demo.taskmanagerbackend.Controller;

import it.demo.taskmanagerbackend.Entities.Task;
import it.demo.taskmanagerbackend.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
@CrossOrigin(origins = "http://localhost:5173")
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    @PostMapping
    public Task addTask(@RequestBody Task task){
        return taskRepository.save(task);
    }

}
