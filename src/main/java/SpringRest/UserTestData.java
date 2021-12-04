package SpringRest;

import SpringRest.model.Role;
import SpringRest.model.User;
import SpringRest.service.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
class UserTestData {

    private final RoleService roleService;
    private final UserService userService;

    public UserTestData(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void userTestData() {
        Set<Role> allRoles = new HashSet<>();
        allRoles.add(new Role("ROLE_ADMIN"));
        allRoles.add(new Role("ROLE_USER"));
        roleService.addRole(allRoles);

        User user1 = new User("first_user_name_1", "last_name_1", 27, "user1@bk", "user1");
        user1.setRoles("ROLE_ADMIN, ROLE_USER");
        userService.addUser(user1);

        User user2 = new User("first_user_name_2", "last_user_name_2", 28,"user2@bk", "user2");
        user2.setRoles("ROLE_USER");
        userService.addUser(user2);

        User user3 = new User("first_user_name_3", "last_user_name_3", 29,"user3@bk", "user3");
        user3.setRoles("ROLE_USER");
        userService.addUser(user3);

        User user4 = new User("first_user_name_4", "last_user_name_4", 30,"user4@bk", "user4");
        user4.setRoles("ROLE_USER");
        userService.addUser(user4);

        User user5 = new User("first_user_name_5", "last_user_name_5", 31,"user5@bk", "user5");
        user5.setRoles("ROLE_USER");
        userService.addUser(user5);

        User user6 = new User("first_user_name_6", "last_user_name_6", 32,"user6@bk", "user6");
        user6.setRoles("ROLE_ADMIN");
        userService.addUser(user6);
    }
}



