Feature: Login1

  Scenario: Login successfully with valid credentials
  
      Given user launch Chrome browser
      When user opens URL "https://katalon-demo-cura.herokuapp.com"
      And click on appointment
      Then user enter id as "John Doe" and password as "ThisIsNotAPassword"
      And click on login
      
      
  Scenario Outline: Login Data Driven
      Given user launch Chrome browser
      When user opens URL "https://katalon-demo-cura.herokuapp.com"
      And click on appointment
      Then user enter id as "<id>" and password as "<password>"
      And click on login
      
      Examples:
      | id | password |
      | John Doe | ThisIsNotAPassword |
      | ram | pass1 |
         
    