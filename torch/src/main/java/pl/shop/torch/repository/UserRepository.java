package pl.shop.torch.repository;

import pl.shop.torch.model.User;

public interface UserRepository {
    boolean existsByUserName(String userName);
    User getUserByUserName(String userName);
    User save(User user);
}
