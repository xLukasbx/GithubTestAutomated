Feature: Test elementary features on Github page

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

  @test
  Scenario: User should login and push commits
    Given User click 'newProject' repository
    And User create branch 'newBranch'
    Then User see created branch 'newBranch'
    When User click Create New File button
    And User set name 'newFile' for new file
    Then User click Commit new file button

  @test
  Scenario: User should login and create pull request
    Given User click 'newProject' repository
    And User select 'newBranch' to pull request
    When User click New Pull Request button
    Then User click on Create pull request button

  @test
  Scenario: User should login and accept pull request
    Given User click 'newProject' repository
    And User click Pull request sub page
    And User click 'Create newFile' pull request
    When User click Merge pull request button
    And User click Confirm merge button
    Then User see status 'Pull request successfully merged and closed'

  @test
  Scenario: User should login and delete a repository
    Given User click 'newProject' repository
    When User click Settings sub page
    And User click Delete repository button
    And User write repository 'newProject' to delete
    Then User see 'Your repository "xTestUser/newProject" was successfully deleted.' on user page after delete repository
