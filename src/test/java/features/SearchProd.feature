Feature: Search Products

Scenario Outline: Search products 
Given User enters <searchItem> and hits Enter key
Then search results are displayed 

Examples: 
|searchItem|
|dresses|


