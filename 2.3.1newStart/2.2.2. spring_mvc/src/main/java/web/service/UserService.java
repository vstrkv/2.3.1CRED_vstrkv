package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    void add(User user);

    void delete(Integer id);

    void edit(User user);

    User getById(Integer id);
}
