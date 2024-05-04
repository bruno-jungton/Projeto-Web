package services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.UserRepository;
import resource.User;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);
    }

    @Override
    public User insert(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(Long id, User newUser) {
        User user = userRepository.getById(id);
        updateUser(user, newUser);
        return userRepository.save(user);
    }

    private void updateUser(User user, User newUser) {
        user.setNome(newUser.getNome());
        user.setEmail(newUser.getEmail());
        user.setTelefone(newUser.getTelefone());
        user.setPassword(newUser.getPassword());
    }
}