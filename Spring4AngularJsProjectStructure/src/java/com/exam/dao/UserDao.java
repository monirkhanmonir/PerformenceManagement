
package com.exam.dao;



import com.exam.model.User;
import java.util.List;

public interface UserDao {
    public User saveUser(User user);
    public User getUserByUsername(String username);
    public List<User> getAll();
    public User getById(long id);
}
