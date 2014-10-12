package fnjsw.service;

import java.util.List;

import fnjsw.entity.User;
import fnjsw.entity.UserExample;
import fnjsw.util.OnePage;

public interface IUserService {

    List<User> getUserByNameAndPwd(String userName, String pwd);

    int newUser(User user);

    List<User> getAllUser();

    OnePage<User> selectOnePage(UserExample example, User user);

    int updateUser(User user);

    int deleteUser(int id);
}
