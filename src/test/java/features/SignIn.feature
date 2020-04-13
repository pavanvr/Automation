Feature: Application Login


Scenario Outline: User Home page displayed after login
Given user is in landing page
When user logs in to application with <email> and <password>
Then User home page is displayed


Examples:
|email					|password	|
|komomolk123@gmail.com	|john123	|




Scenario Outline: Search products 
Given I enter <searchItem> and hit Enter key
Then search results are displayed 

Examples: 
|searchItem|
|dresses|

Scenario: Add products to the cart and checkout 
Given User adds products to the cart and proceeds to checkout
Then Order is successful and a confirmation is displayed
