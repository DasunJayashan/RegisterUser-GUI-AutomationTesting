Feature: As a User I need to register to the Mercury Tours So that I can use its services
  Background: User navigate to Register Page
    Given User is on Home Page --> Register Page
    Scenario: User successfully register to the system
      Given User enter first name as "Dasun"
      And User enter last name as "Jayashan"
      And User enter phone number as "0778592055"
      And User enter email address as "dasunjayashan123@gmail.com"
      And User select country as "SRI LANKA"
      And User enter user name as "DasunJayashan"
      And User enter password as "Dasun@123"
      And User enter confirm password as "Dasun@123"
      When User clicks on submit
      Then Salutation message will displays as "Dear Dasun Jayashan,"
