package it.demo.taskmanagerbackend.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "Tasks")
public class Task {

    @Id
    private int id;
    private String header;
    private String body;
    private String status;

    public Task(){
    }

    public Task(int id, String header, String body, String status) {
        this.id = id;
        this.header = header;
        this.body = body;
        this.status = status;
    }

    public String getHeader() {return header;}
    public String getBody() {return body;}
    public String getStatus() {return status;}

    public void setHeader(String header) {this.header = header;}
    public void setBody(String body) {this.body = body;}
    public void setStatus(String status) {this.status = status;}

    public String toString(){
        return "Task [id=" + id + ", header=" + header + ", body=" + body + ", status=" + status;
    }

}
