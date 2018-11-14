#Author: shukla

Feature: Email Regs
Scenario:  Check heading of the login page
Given User is on registration page

Then check the heading of the page

Scenario: Enter two different  password 
Given User is on registration page
When User enters two different passwords
Then display alert messgaes

Scenario: Enter all details correctly
Given User is on registration page
When User enters all details correctly
Then display the success message

Scenario: When user clicks reset buutton
Given User is on registration page
When User clicks on reset button
Then navigate to registration page









