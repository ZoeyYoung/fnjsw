package fnjsw.component;

import java.util.List;

import fnjsw.entity.User;
import fnjsw.entity.UserExample;
import fnjsw.util.OnePage;

public interface IUserComponent {

    /**
     * 通过用户名和密码找到User
     * 
     * @param userName
     * @param pwd
     * @return
     */
    List<User> getByNameAndPwd(String userName, String pwd);

    /**
     * 新建一个用户
     * 
     * @param user
     * @return
     */
    int save(User user);

    /**
     * 获得所有的用户
     * 
     * @return
     */
    List<User> getAll();

    /**
     * 查询一定量的用户
     * 
     * @param example
     * @return
     */
    OnePage<User> selectOnePage(UserExample example);

    /**
     * 更新用户
     * 
     * @param user
     * @return
     */
    int update(User user);

    int delete(int id);
}
