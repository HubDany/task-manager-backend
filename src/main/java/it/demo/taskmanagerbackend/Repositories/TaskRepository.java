package it.demo.taskmanagerbackend.Repositories;

import it.demo.taskmanagerbackend.Entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    public Task findById(int id);

    public void createTask(Task task);
}
