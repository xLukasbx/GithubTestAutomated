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

### How to work?
We have below scenario which consists with steps: 
  
    Background: Steps are executed before each scenario
    
        Given User run 'https://github.com/' page
        Then User see 'Built for developers' on home page
        Given User click sign in on home page
        When User write 'githubtrial69@gmail.com' to email field
        And User write '12345qwert' to password field
        And User click sign in button
        Then User see 'Learn Git and GitHub without any code!' on user page after sign in

    @test
    Scenario: User should login and create a repository
    
        When User click start project button
        And User set name 'newProject' for repository
        And User mark Initial repository with file README
        And User click Create repository button
        Then User see created repository 'newProject'

Each step is executed from java code. Example, under step:

    Given User run 'https://github.com/' page
    
We have code from class src/test/java/steps/HomePageSteps (below is presented part of content class).

    @Given("^User run '(.*?)' page$")
    public void userRunGithubPage(String nameOfPage) throws Throwable {
        homePage.getPage(nameOfPage);
    }

In this project has been used to design pattern [page object](https://martinfowler.com/bliki/PageObject.html).
As we can see homePage it object class src/main/java/github/pageObject/HomePage which represent home page 
on github website.      

## The repos was archived and is not relevant any more
