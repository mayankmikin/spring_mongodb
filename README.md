# spring_mongodb
here i am using Java Configuration so explaining the flow 
Step 1. Create a Pom.xml as per ur need with Spring and Servlet dependency
2. Created public class FirstPageController with a mapping of @RequestMapping("/") . it will take any request at first considering is as (/*) mapping
3. Now based on the string return by the first controller Add a view in the folder src>main>Webapp>WEB-INF/views/welcome.jsp . Obviously you have to create a view in jsp or HTML 
4.write some code in the jsp or html to make a good view of ur page
Step 5: Add Configuration Class here that class is public class FirstConfiguration 
Step 6: Add Initialization class
Note : For complete refrence check out this link :
http://websystique.com/springmvc/spring-4-mvc-helloworld-tutorial-annotation-javaconfig-full-example/
Spring Secuity link:
http://websystique.com/springmvc/spring-mvc-4-and-spring-security-4-integration-example/ 
For mongo db with spring data refer this link :
http://www.baeldung.com/spring-data-mongodb-tutorial





NOW HOW TO START A MONGODB on windows :
1.Download mongo db for windows from here : https://www.mongodb.com/download-center#community
2. install it and it will be installed in your c drive sometghing like :C:\Program Files\MongoDB\Server\3.4\bin
3. go to this folder press SHIFT+right click and choose open command window here 
4. Go to any of your drive create a folder by name test now inside this folder create another folder named mongodb and then inside mongo db create another folder by name data. This data will be your table space location (People from RDBMS background can relate it better)
5.now run this command : mongod.exe --dbpath X:\test\mongodb\data
6. TA DAAA....... mongo db is running on port number 27017
7. here X: is my drive location you have to replace this path with your own.
If you are still not able to run it u can commit suicide ............. world doesn't needs you anymore .If you still don't find it a good reason to die for then other options are you can be whatsapp group admin or run a facebook page and wait for people to criticise you then you can write the names of all the people responsible in your suicide note . DIE DIE DIE.
  
