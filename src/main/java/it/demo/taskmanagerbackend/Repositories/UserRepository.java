package it.demo.taskmanagerbackend.Repositories;

import it.demo.taskmanagerbackend.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    public Users findByUsername(String username);
    public List<Users> findAllUsers();

    //methods to add/update or delete users subscription
    public void registerUser(Users user);
}
