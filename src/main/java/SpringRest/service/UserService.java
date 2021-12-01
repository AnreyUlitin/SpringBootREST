package SpringRest.service;

import SpringRest.model.*;
import java.util.*;


public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    Optional<User> getUserById(Long id);

    User getByUsername(String username);

    User getUser(Long id);

    List<User> getAllUsers();

}

