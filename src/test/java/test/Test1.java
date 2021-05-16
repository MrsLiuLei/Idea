package test;

import bean.Account;
import bean.User;
import bean.User1;
import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;

import java.util.Date;
import java.util.List;

public class Test1 {
    @Test
    public void find(){
        SqlSession session = MybatisUtils.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> list = userDao.find();
        System.out.println(list);
        session.close();
    }
    @Test
    public void find1(){
        SqlSession session = MybatisUtils.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<Account> list = userDao.find1();
        System.out.println(list);
        session.close();
    }
    @Test
    public void find2(){
        SqlSession session = MybatisUtils.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<User1> list = userDao.find2();
        System.out.println(list);
        session.close();
    }
    @Test
    public void add(){
        SqlSession session = MybatisUtils.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user = new User();
        user.setName("hu");
        user.setSex("男");
        user.setBirthday(new Date());
        user.setAddress("长沙");
        int i = userDao.add(user);
        System.out.println(i);
        System.out.println(user.getId());
        session.commit();
        session.close();
    }
}
