Feature: Add products to cart and check out for an existing user


Scenario Outline: Add products to the cart and checkout 
Given User adds few products to the cart and proceeds to checkout
Then User logs in as an existing user with <email> and <password>
Then Order is successful and a confirmation msg is displayed




Examples:
|email					|password	|
|komomolk123@gmail.com	|john123	|



