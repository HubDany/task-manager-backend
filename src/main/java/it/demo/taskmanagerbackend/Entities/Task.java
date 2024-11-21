package it.demo.taskmanagerbackend.Entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.UUID;

@Entity
@Table(name = "Tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String task_id;
    private String header;
    private String body;
    private String status;

    public Task(){
        this.task_id = UUID.randomUUID().toString();
    }

    public Task(int id, String task_id, String header, String body, String status) {
        this.id = id;
        this.task_id = task_id;
        this.header = header;
        this.body = body;
        this.status = status;
    }

    public String getHeader() {return header;}
    public String getBody() {return body;}
    public String getStatus() {return status;}
    public String getTaskId() {return task_id;}

    public void setHeader(String header) {this.header = header;}
    public void setBody(String body) {this.body = body;}
    public void setStatus(String status) {this.status = status;}
    public void setTask_id(String task_id) {this.task_id = task_id;}

    public String toString(){
        return "Task [id=" + id +", TaskID=" + task_id + ", header=" + header + ", body=" + body + ", status=" + status;
    }

}
