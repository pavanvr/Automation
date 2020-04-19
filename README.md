# Automation

Framework design using Cucumber, TestNG and Mvn :

Below is the overview and list of few advantages for choosing this framework – 

Cucumber which leverages BDD (Behavior Driven Development) provides greater collaboration between different teams like Business and IT. It allows users to define application behavior in plain English which is easily understandable to all the teams including non-technical people. Also, the tests are written in a uniform structure which can be easily maintained. 
TestNG is an open source test automation framework which provide easy and yet powerful annotations using which the tests can be prioritized, grouped and run in parallel effortlessly with total control over the test execution. It also has advantages of producing html reports, generate logs, data parameterization etc.
Maven is a POM (Project object model) build management tool which uses centralized file pom xml where one can easily configure all the dependencies required for building, testing and running the code. Maven downloads the required files automatically from the central repository.

Combining all these three will make a robust test automation framework, which allows creating easy to understand scenarios called features, build seamlessly, organize the tests for total control over test execution and generate reports.   

Steps to run the Automation suite:

Using Maven –
From command prompt, navigate to the project folder and use the below commands to run the tests –
mvn clean
mvn compile
mvn test
To view html reports – refresh the project and navigate to target>surefire-reports>index.html 

Using TestNG – 

Eclipse IDE – under the project folder, 
-	right click on file ‘testngCucumberAllTests.xml’ 
-	Select Run As
-	Click on TestNG Suite
To view html reports – refresh the project and navigate to test-output>index.html
