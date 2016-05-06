package com.app.myapplication.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

/**
 * Created by maverma on 01/05/16.
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.app.myapplication")
@PropertySource("classpath:data/database.properties")
public class MongoConfig  {

    @Value("${mongodb.db}")
    private String dbname;

    @Value("${mongodb.url}")
    private String mongodbUrl;

    @Value("${mongodb.port}")
    private String dbport;


    @Autowired
    private Environment env;

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {

        String mongodbUrl = env.getProperty("mongodb.url");
        String defaultDb = env.getProperty("mongodb.db");

        MongoClientOptions mongoOptions =
                new MongoClientOptions.Builder().maxWaitTime(1000 * 60 * 5).build();
        MongoClient mongo = new MongoClient(mongodbUrl, mongoOptions);
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongo, defaultDb);
        return new MongoTemplate(mongoDbFactory);

    }

}
