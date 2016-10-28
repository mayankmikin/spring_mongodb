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

