# spring_mongodb
here i am using Java Configuration so explaining the flow 
Step 1. Create a Pom.xml as per ur need with Spring and Servlet dependency
2. Created public class FirstPageController with a mapping of @RequestMapping("/") . it will take any request at first considering is as (/*) mapping
3. Now based on the string return by the first controller Add a view int the folder INF/views/welcome.jsp . Obviously you have to create 
