package pl.shop.torch.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.shop.torch.dto.UserDto;
import pl.shop.torch.mapper.UserMapper;
import pl.shop.torch.model.User;
import pl.shop.torch.repository.UserRepository;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public boolean existsByLogin(UserDto userDto) {
        return userRepository.existsByUserName(userDto.getUserName());
    }

    public boolean verifyPassword(UserDto userDto) {
        if (existsByLogin(userDto)) {
            User user = userRepository.getUserByUserName(userDto.getUserName());
            return user.getUserPassword().equals(userDto.getUserPassword());
        }
        return false;
    }

    public boolean loginUser(UserDto userDto) {
        return verifyPassword(userDto);
    }

    public boolean registerNewUser(UserDto userDto) {
        if (!existsByLogin(userDto)) {
            userRepository.save(userMapper.mapToUser(userDto));
            return true;
        }
        return false;
    }
}
