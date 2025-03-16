package ru.unclenikola.springboot.PP_3_1_1_Spring_MVC_Hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.unclenikola.springboot.PP_3_1_1_Spring_MVC_Hibernate.UserRepository.UserRepository;
import ru.unclenikola.springboot.PP_3_1_1_Spring_MVC_Hibernate.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

@Override
@Transactional
public List<User> getAllUsers() {
    return userRepository.findAll();
}

    @Override
    @Transactional
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}