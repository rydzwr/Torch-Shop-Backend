package pl.shop.torch.mapper;

import org.springframework.stereotype.Service;
import pl.shop.torch.dto.UserDto;
import pl.shop.torch.model.User;

@Service
public class UserMapper {
    public User mapToUser(UserDto userDto) {
        return new User(
                userDto.getUserName(),
                userDto.getUserPassword(),
                userDto.getUserEmail()
        );
    }

    public UserDto mapToUserDto(User user) {
        return new UserDto(
                user.getUserName(),
                user.getUserPassword(),
                user.getUserEmail()
        );
    }
}
