package it.demo.taskmanagerbackend.Services;

import it.demo.taskmanagerbackend.Entities.Task;

import java.util.List;

public interface TaskService {
    public Task findTaskById(int id);
    public List<Task> findAllTasks();

}
