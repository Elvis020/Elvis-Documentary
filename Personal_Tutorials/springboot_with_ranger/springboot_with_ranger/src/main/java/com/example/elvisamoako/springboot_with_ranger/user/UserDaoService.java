package com.example.elvisamoako.springboot_with_ranger.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> list_of_users = new ArrayList<>();
    private int userCount = 3;

    static{
        list_of_users.add(new User(1,"Adam",new Date()));
        list_of_users.add(new User(2,"Eve",new Date()));
        list_of_users.add(new User(3,"Jack",new Date()));
    }

//    method to findAllUser
    public List<User> findAll(){
        return list_of_users;
    }
//     method to save user
    public User saveUser(User user){
        if(user.getID() == Integer.parseInt(null)){
            user.setID(++userCount);
        }
        list_of_users.add(user);
        return user;
    }

//    method to findOne
    public User findOneUser(int id){
        for (User user: list_of_users){
            if(user.getID() == id){
                return user;
            }
        }

        return null;
    }
}
