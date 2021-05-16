package dao;

import bean.Account;
import bean.User;
import bean.User1;

import java.util.List;

public interface UserDao {
    List<User> find();
    List<Account> find1();
    List<User1> find2();
    int add(User user);
}
