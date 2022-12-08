# Harish-Vemula-NHSBSA
### Automation NHSBSA
This repository contains the NHS Cost checker tool Automation framework using Selenium, JAVA, Cucumber. 

### Installation (pre-requisites)
1. JDK 1.8+ (make sure Java class path is set)
2. Maven (make sure .m2 class path is set)
3. IntelliJ
4. IntelliJ Plugins for
    - Maven
    - Cucumber

### Framework set up
Fork / Clone repository from [here]( https://github.com/harishrqa/Harish-Vemula-NHSBSA) or download zip and set it up in your local workspace.
### Run Tests
- Open terminal (MAC OSX) or command prompt / power shell (for windows OS) and navigate to the project directory type mvn clean test command to run features. With this command it will invoke the default Firefox browser and will execute the tests.
- To run features on specific browser use, mvn test -DBROWSER="browser_name" browser_name can be one of following -- firefox -- chrome
