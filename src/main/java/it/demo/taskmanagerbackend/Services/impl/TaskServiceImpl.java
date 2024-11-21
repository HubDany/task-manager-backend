package it.demo.taskmanagerbackend.Services.impl;

import it.demo.taskmanagerbackend.Entities.Task;
import it.demo.taskmanagerbackend.Repositories.TaskRepository;
import it.demo.taskmanagerbackend.Services.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task findTaskById(int id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }
}
