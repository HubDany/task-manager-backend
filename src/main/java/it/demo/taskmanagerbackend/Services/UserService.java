package it.demo.taskmanagerbackend.Services;

import it.demo.taskmanagerbackend.Entities.Users;

import java.util.List;

public interface UserService {

    public Users findByUsername(String username);
    public List<Users> find_all_users();


}
