# UI Automated Test

### Automated test for web application
This project show sample scenarios, steps and page objects for test automated 
website: https://github.com. You can run 
tests on Windows, Linux or Mac OS X system.


### How to run?
We must install this components:
1. [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
2. Cucumber ([Behave for Java](https://cucumber.io)) 
3. [Selenium server standalone](http://www.seleniumhq.org/download/) 
4. [Chrome driver](https://chromedriver.storage.googleapis.com/index.html?path=2.33/)
5. [Junit](http://junit.org/junit4/)
6. [IntelliJ IDEA](https://www.jetbrains.com/idea/) - professional 
version

After install selenium server, run it by command in terminal (example for 
selenium-server-standalone-3.8.0.jar):

``
java -jar selenium-server-standalone-3.8.0.jar
``

You can run test from class: 
``
src/test/java/RunTest
``


After test we can generate report in HTML or XML format.