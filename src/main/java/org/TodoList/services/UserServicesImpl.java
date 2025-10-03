package org.TodoList.services;

import org.TodoList.data.model.User;
import org.TodoList.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public class UserServicesImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        user.setCreatedAt(LocalDate.now());
        return userRepository.save(user);
    }

    @Override
    public User updateUser(String id, User user) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    existingUser.setFirstName(user.getFirstName());
                    existingUser.setLastName(user.getLastName());
                    existingUser.setEmail(user.getEmail());
                    return userRepository.save(existingUser);
                }).orElse(null);


    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);


    }
    @Override
    public User getUser(String id){

        return userRepository.findById(id).orElse(null);
    }
    public void deleteUser(String Id){

        userRepository.deleteById(Id);
    }
}

