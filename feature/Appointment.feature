Feature: Appointment

Scenario: Book Appointment
      Given user launch Chrome browser
      When user opens URL "https://katalon-demo-cura.herokuapp.com"
      And click on appointment
      Then user enter id as "John Doe" and password as "ThisIsNotAPassword"
      And click on login
      And user can view appointment detail page
      Then user click on facility list
      Then user click checkbox
      And user select healthcare program 
      And user enter visit date as "12/08/1994"
      Then  user write comment abouut issue as "backpain"
      Then user click on book Appointment
        