package az.autobazar.service.impl;

import az.autobazar.domain.Role;
import az.autobazar.domain.User;
import az.autobazar.repository.UserRepository;
import az.autobazar.service.UserService;
import org.mindrot.jbcrypt.BCrypt;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Override
    public List<Role> getUserRoles(long userId) {
        return userRepository.getUserRoles(userId);
    }

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean checkEmail(String email) {
        return userRepository.checkEmail(email);
    }

    @Override
    public boolean checkMobile(String mobile) {
        return userRepository.checkMobile(mobile);
    }

    @Override
    public void addUser(User user) {
        String password = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(password);
        userRepository.addUser(user);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }
}
