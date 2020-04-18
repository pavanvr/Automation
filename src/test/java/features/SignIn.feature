Feature: Application Login


Scenario Outline: User logs into his account and checks his personal information
Given user is in landing page
When user logs in to application with <email> and <password>
Then User home page is displayed and user proceeds to check personal information
Then User personal information page is displayed with user personal details 


Examples:
|email					|password	|
|komomolk123@gmail.com	|john123	|
