package pl.shop.torch.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.shop.torch.dto.UserDto;
import pl.shop.torch.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/login")
    public ResponseEntity<Boolean> loginUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.loginUser(userDto));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<Boolean> registerNewUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.registerNewUser(userDto));
    }
}
