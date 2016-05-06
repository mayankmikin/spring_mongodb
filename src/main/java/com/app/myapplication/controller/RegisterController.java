package com.app.myapplication.controller;

import com.app.myapplication.configuration.MongoConfig;
import com.app.myapplication.model.User;
import com.app.myapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by maverma on 30/04/16.
 */
@RestController
public class RegisterController
{
    @Autowired
    UserService userService;  //Service which will do all data retrieval/manipulation work
    @Autowired
    MongoConfig mongodb;



    @RequestMapping(value = "/user/add/{username}", method = RequestMethod.GET)
    public ResponseEntity<User> addUsers(@RequestParam(value="username",required=true)String username, Model model, HttpSession session,UriComponentsBuilder ucBuilder )

    {
        System.out.println("Adding User");
        System.out.println(username);


        User user= new User();
        user.setName(username);
        user.setAge(27);
        user.setSalary(50000);
           boolean inserted= userService.saveUser(user);
        if(inserted)
        {
            HttpHeaders headers = new HttpHeaders();
            headers.setLocation(ucBuilder.path("/user/{username}").buildAndExpand(user.getId()).toUri());
            return new ResponseEntity<User>(headers, HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }
    }
    @RequestMapping(value = "/rest/login/{username}", method = RequestMethod.GET)
    public ResponseEntity<User> add_A_User(@PathVariable(value="username")String username, Model model, HttpSession session,UriComponentsBuilder ucBuilder )

    {
        System.out.println("Adding User");
        System.out.println(username);
        //System.out.println(password);

        User user= new User();
        user.setName(username);
        user.setAge(25);
        user.setSalary(100);
        boolean inserted= userService.saveUser(user);
        if(inserted)
        {
            HttpHeaders headers = new HttpHeaders();
            headers.setLocation(ucBuilder.path("/rest/login/{username}/{password}").buildAndExpand(user.getId()).toUri());
            return new ResponseEntity<User>(headers, HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }
    }

    //rest/login.html?username="+user+"&password="+pass;

}
