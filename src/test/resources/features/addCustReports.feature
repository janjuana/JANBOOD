#Author: SyntaxTeam
Feature: Add Customers and Reports

  Background: 
    Given OrangeHRM logo is displayed

  Scenario Outline: Add Customer in Project Info and Confirm
    When I enter "admin" and "admin123"
    And I click on login button
    And I click on Time Module
    And I click on Project Info
    And I click on Customers
    And I click on Add Button
    And I input a "<CustomerName>"
    And I input the "<Description>"
    And I click Save
    Then I see the "<CustomerName>"

    Examples: 
      | CustomerName | Description |
      | JanBooD31    | Yellow      |

  Scenario Outline: Add Project and Confirm
    When I enter "admin" and "admin123"
    And I click on login button
    And I click on Time Module
    And I click on Project Info
    And I select Projects
    And I click Add button
    And I input same "<CustomerName>"
    And I add the "<Project name>"
    And I add "<Project admin>"
    And I click Save
    And I click on Time Module
    And I click on Project Info
    And I select Projects
    Then I see "<CustomerName>" is saved

    Examples: 
      | CustomerName | Project name | Project admin  |
      | JanBooD31    | NewProject   | Thomas Fleming |

  Scenario Outline: Confirm Customer Name and Project from previous entry
    When I enter "admin" and "admin123"
    And I click on login button
    And I click on Time Module
    And I click on Project Reports
    And I enter "<CustomerNameProjectInfo>" from previous entry
    And click View
    Then "<CustomerNameProjectInfo>" displayed

    Examples: 
      | CustomerNameProjectInfo |
      | JanBooD31 - NewProject  |
