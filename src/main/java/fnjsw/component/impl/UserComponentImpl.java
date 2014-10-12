package fnjsw.component.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springside.modules.mapper.JsonMapper;

import fnjsw.component.IUserComponent;
import fnjsw.entity.User;
import fnjsw.entity.UserExample;
import fnjsw.mapper.UserMapper;
import fnjsw.util.OnePage;

@Component
public class UserComponentImpl implements IUserComponent {

    private static Logger logger = LoggerFactory
            .getLogger(UserComponentImpl.class);

    private static JsonMapper mapper = JsonMapper.nonDefaultMapper();

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getByNameAndPwd(String userName, String pwd) {
        List<User> userList = new ArrayList<User>();

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(userName);
        criteria.andPwdEqualTo(pwd);
        // add log & try catch
        userList = userMapper.selectByExample(example);

        return userList;
    }

    @Override
    public int save(User user) {
        // add log & try catch
        int result = userMapper.insert(user);
        return result;
    }

    @Override
    public List<User> getAll() {
        List<User> userList = new ArrayList<User>();

        UserExample example = new UserExample();
        // UserExample.Criteria criteria = example.createCriteria();
        // add log & try catch
        userList = userMapper.selectByExample(example);
        return userList;
    }

    @Override
    public OnePage<User> selectOnePage(UserExample example) {
        OnePage<User> onepage = new OnePage<User>();

        int count = userMapper.countByExample(example);

        List<User> userList = userMapper.selectByExample(example);

        example.getPage().setCount(count);
        onepage.setPage(example.getPage());
        onepage.setDataList(userList);

        return onepage;
    }

    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int delete(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

}
