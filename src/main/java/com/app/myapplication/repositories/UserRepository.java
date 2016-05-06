package com.app.myapplication.repositories;

import com.app.myapplication.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import java.util.List;

/**
 * Created by maverma on 01/05/16.
 */

    public interface UserRepository extends MongoRepository<User, String>
{


//    List<User> findUsersByName(String name);
//
//
//    List<User> findUsersByAgeBetween(int ageGT, int ageLT);
//
//
//    List<User> findUsersByRegexpName(String regexp);
//
//    List<User> findByName(String name);
//
//    List<User> findByNameLikeOrderByAgeAsc(String name);
//
//    List<User> findByAgeBetween(int ageGT, int ageLT);
//
//    List<User> findByNameStartingWith(String regexp);
//
//    List<User> findByNameEndingWith(String regexp);

    List<User> findById(long id);
}

