Feature: addtocart

Scenario:  The one where the user moves to cart without adding any item to it

Given Alex has registered into TestMeApp
When Alex search a particular product like headphones
And try to poceed to payment withoput adding any items to the cart
Then TestMeApp does not display the cart icon