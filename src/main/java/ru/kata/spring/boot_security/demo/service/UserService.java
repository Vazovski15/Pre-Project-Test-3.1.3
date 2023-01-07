package ru.kata.spring.boot_security.demo.service;




import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {            // задача - по имени пользователя предоставить самого пользователя
    boolean addRole (Role role);
    Role findByNameRole (String name);
    List<Role> getAllRoles();
    Role findByIdRole(Long id);
    List<Role> listByRole(List<String> name);
    void add (User user);
    List<User> getAllUsers();
    void delete (Long id);
    void edit(User user);
    User getUser(Long id);
    User findByUsername (String username);

}
