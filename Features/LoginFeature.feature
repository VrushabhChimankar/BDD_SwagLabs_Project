Feature: Login

@Sanity 
Scenario: Successful login with valid credentials


Given user launches chrome browser
When user opens URL "https://www.saucedemo.com/v1/"
And user enters username as "standard_user" and password as "secret_sauce"
And Click on login button
Then Page title should be "Swag Labs"
And user click on open menu and logout button
Then user can view homepage as "Swag Labs"
And close browser