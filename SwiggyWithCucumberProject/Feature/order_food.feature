Feature: Order a food feature
Scenario: A user should be able to Order a food successfully on Swiggy
Given user is on the landing page of Swiggy
When he enters an address 'Bangalore,Karnatka,India' in the delivery text-box
And he clicks on first available Restaurant
And he clicks on add first available food
And he clicks on view cart
Then he must be able to Order the food successfully