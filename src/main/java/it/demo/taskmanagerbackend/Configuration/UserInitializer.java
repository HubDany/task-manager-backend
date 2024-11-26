package it.demo.taskmanagerbackend.Configuration;

import it.demo.taskmanagerbackend.Entities.Users;
import it.demo.taskmanagerbackend.Repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserInitializer {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void init() {
        if (userRepository.count() == 0) {
            String encodedPassword = passwordEncoder.encode("root");

            System.out.println("Entrato nel post constructor");

            Users user = new Users();
            user.setUsername("dnicoletta");
            user.setPassword(encodedPassword);
            user.setRole("ADMIN");
            user.setEmail("dnicoletta@gmail.com");
            user.setFirstName("Daniele");
            user.setLastName("Nicoletta");
            userRepository.save(user);
        }
    }


}
