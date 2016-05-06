package com.app.myapplication.service;

import com.app.myapplication.model.User;
import com.app.myapplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by maverma on 30/04/16.
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repo;

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public boolean saveUser(User user) {
        repo.save(user);
        return repo.exists(String.valueOf(user.getId()));
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserById(long id) {

    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public void deleteAllUsers() {

    }

    @Override
    public boolean isUserExist(User user) {
        return false;
    }
//    public MongoTemplate mongoTemplate;
//    private static final AtomicLong counter = new AtomicLong();
//
//    private static List<User> users;
//
//    static{
//        users= populateDummyUsers();
//    }
//
//    public List<User> findAllUsers() {
//        return users;
//    }
//
//    public User findById(long id) {
//        for(User user : users){
//            if(user.getId() == id){
//                return user;
//            }
//        }
//        return null;
//    }
//
//    public User findByName(String name) {
//        for(User user : users){
//            if(user.getName().equalsIgnoreCase(name)){
//                return user;
//            }
//        }
//        return null;
//    }
//
//    public void saveUser(User user) {
//        user.setId(counter.incrementAndGet());
//        users.add(user);
//        mongoTemplate.insert(user, "user");
//    }
//
//    public void updateUser(User user) {
//        int index = users.indexOf(user);
//        users.set(index, user);
//    }
//
//    public void deleteUserById(long id) {
//
//        for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
//            User user = iterator.next();
//            if (user.getId() == id) {
//                iterator.remove();
//            }
//        }
//    }
//
//    public boolean isUserExist(User user) {
//        return findByName(user.getName())!=null;
//    }
//
//    private static List<User> populateDummyUsers(){
//        List<User> users = new ArrayList<User>();
//        users.add(new User(counter.incrementAndGet(),"Sam",30, 70000));
//        users.add(new User(counter.incrementAndGet(),"Tom",40, 50000));
//        users.add(new User(counter.incrementAndGet(),"Jerome",45, 30000));
//        users.add(new User(counter.incrementAndGet(),"Silvia",50, 40000));
//        return users;
//    }
//
//    public void deleteAllUsers() {
//        users.clear();
//    }



}
