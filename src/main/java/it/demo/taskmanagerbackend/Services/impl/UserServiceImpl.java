package it.demo.taskmanagerbackend.Services.impl;

import it.demo.taskmanagerbackend.Entities.Users;
import it.demo.taskmanagerbackend.Repositories.UserRepository;
import it.demo.taskmanagerbackend.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<Users> find_all_users() {
        return userRepository.findAll();
    }

    @Override
    public void registerUser(Users user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(Users user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }


}
