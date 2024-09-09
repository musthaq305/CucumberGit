Feature: To validate the login functionality of facebook application

  Scenario: 
          To Validate the login with invalid username and valid password

    When User have to enter  invalid username and valid password
      | username | password | email                 |
      | java     |   123456 | sst123@gmail.com      |
      | oracle   |    98765 | java123@gmail.com     |
      | .net     | pytho    | selenium456@gmail.com |
    And User have to click login button
    Then User have to reach invalid credential page
