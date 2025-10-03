package org.TodoList.services;


import org.TodoList.data.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
User createUser(User user);
User updateUser(String id, User user);
void deleteUser(String Id);
User getUser(String id);
User getUserByEmail(String email);

}
