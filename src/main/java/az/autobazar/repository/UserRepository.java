package az.autobazar.repository;

import az.autobazar.domain.Role;
import az.autobazar.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    boolean checkEmail(String email);

    boolean checkMobile(String mobile);

    void addUser(User user);

    Optional<User> getUserByEmail(String email);

    List<Role> getUserRoles(long userId);

}
