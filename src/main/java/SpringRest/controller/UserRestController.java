package SpringRest.controller;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import SpringRest.model.Role;
import SpringRest.model.User;
import SpringRest.service.RoleService;
import SpringRest.service.UserService;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserRestController {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public UserRestController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("/getAllUsers") //работает в почтальоне
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/getAllRoles") //работате в почтальоне
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/getUserById/{id}")
    public Optional<User> getUserById(@PathVariable Long id) { //работате в почтальоне
        return userService.getUserById(id);
    }

    @PostMapping(value = "/create")      // работате в почтальоне
    public User createNewUser(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) { // работате в почтальоне
        userService.updateUser(user);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) { //работате в почтальоне
        userService.deleteUserById(id);
        return "User with ID = " + id + " was deleted";
    }

}


















