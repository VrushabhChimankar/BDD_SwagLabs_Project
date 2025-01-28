# SauceDemo Login Test Case
- **Author**: Vrushabh Chimankar

This project demonstrates a simple test case for the login functionality of the [SauceDemo website](https://www.saucedemo.com/v1/). The test is written using the Behavior-Driven Development (BDD) framework to ensure the login functionality behaves as expected.

## Features

- **Login Test**: Tests the login functionality with valid credentials.
- **BDD Framework**: Uses Gherkin syntax to define the test behavior in a natural language format.

## Prerequisites

Make sure you have the following tools installed:


- [Cucumber](https://cucumber.io/) - BDD testing framework.
- [Selenium WebDriver](https://www.selenium.dev/documentation/en/webdriver/) - For browser automation.


## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/VrushabhChimankar/BDD_SwagLabs_Project.git
   cd BDD_SwagLabs_Project
   
   
Feature: Login to SauceDemo

  Scenario: Successful login with valid credentials
  
    Given I open the SauceDemo login page
    When I enter the username "standard_user" and password "secret_sauce"
    Then Page title should be "Swag Labs"
    And I click on open menu and logout button
    Then I can view homepage as "Swag Labs"
    And Close browser
   
