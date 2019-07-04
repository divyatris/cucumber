Feature: Login

Scenario Outline: Login with valid credentials
Given user access the login page
When user enters username as "<uname>"
And user enters password as "<pass>"
Then click login

Examples:
|uname||pass|
|lalitha||Password123|
