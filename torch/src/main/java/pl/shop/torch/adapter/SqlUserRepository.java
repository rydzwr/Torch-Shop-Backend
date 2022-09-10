package pl.shop.torch.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.shop.torch.model.User;
import pl.shop.torch.repository.UserRepository;

public interface SqlUserRepository extends UserRepository, JpaRepository<User, Integer> {
}
