package mvc.controller.user;

import mvc.service.RoleService;
import mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserMainController {
    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

//    @RequestMapping(value = "/user/", method = RequestMethod.GET)
//    public ResponseEntity<List<User>> listAllUsers() {
//        List<User> users = userService.getAllUsers();
//        if (users.isEmpty()) {
//            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
//    }

//    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<User> getUser(@PathVariable("id") Integer id) {
//        System.out.println("Fetching User with id " + id);
//        User user = userService.getById(id);
//        if (user == null) {
//            System.out.println("User with id " + id + " not found");
//            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<User>(user, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/user/", method = RequestMethod.POST)
//    public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
//        System.out.println("Creating User " + user.getName());
//
////        if(userService.isUserExists(user)){
////            System.out.println("A User with name " + user.getName() + "already exists");
////            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
////        }
//
//        userService.save(user);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
//        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//    }
//
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
//    public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User user) {
//        System.out.println("Updating User " + id);
//
//        User currentUser = userService.getById(id);
//
//        if (currentUser == null) {
//            System.out.println("User with id " + id + " not found");
//            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//        }
//
//        currentUser.setName(user.getName());
//        currentUser.setEmail(user.getEmail());
//        currentUser.setPassword(user.getPassword());
//        currentUser.setRole(user.getRole());
//
//        userService.update(currentUser);
//        return new ResponseEntity<User>(currentUser, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<User> deleteUser(@PathVariable("id") Integer id){
//        System.out.println("Fetching & Deleting User with id " + id);
//
//        User user = userService.getById(id);
//        if(user == null){
//            System.out.println("Unable to delete. User with id "+ id + " not found");
//            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//        }
//
//        userService.deleteById(id);
//        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
//    }

    @RequestMapping(value = "/user/auth", method = RequestMethod.GET)
    public boolean authorized(@RequestParam("email") String email, @RequestParam("password") String password){
        System.out.println("Authorizing user " + email + " " + password);
        return userService.authorizeUser(email, password);
    }
}
























