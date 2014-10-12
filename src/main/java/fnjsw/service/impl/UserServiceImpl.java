package fnjsw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fnjsw.component.IUserComponent;
import fnjsw.entity.User;
import fnjsw.entity.UserExample;
import fnjsw.service.IUserService;
import fnjsw.util.OnePage;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserComponent userComponent;

    @Override
    public List<User> getUserByNameAndPwd(String userName, String pwd) {
        return userComponent.getByNameAndPwd(userName, pwd);
    }

    @Override
    @Transactional
    public int newUser(User user) {
        return userComponent.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userComponent.getAll();
    }

    @Override
    public OnePage<User> selectOnePage(UserExample example, User user) {

        UserExample.Criteria cirteria = example.createCriteria();

        // 对 criteria 的条件进行修改

        return userComponent.selectOnePage(example);

    }

    @Override
    @Transactional
    public int updateUser(User user) {
        return userComponent.update(user);
    }

    @Override
    @Transactional
    public int deleteUser(int id) {
        return userComponent.delete(id);
    }

}
