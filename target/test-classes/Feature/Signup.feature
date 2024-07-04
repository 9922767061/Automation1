Feature: user want to login to orangehrm and create Account

Scenario: Check login Succussesful With valid input and do signup
Given user on login page
When user enter the name and email
And click on sinup
Then verify the Home Page
And user select the titel
And user create the password
And user select the birth date
And user eneter the firstname and lastname
And user enter the Address
And user enter the cityname
And user enter the statename
And user enter the mobileno and zipcode
And user click on Create Account button
Then verify the Account created Message is display


Scenario: to verify select the product,addtocart,makepayment end to end flow
Given user on login page
When user enter username and password
And click on login button
And user click on product
And user click on man 
And user click on t-shirt
And user click on view product button
And user click on Addtocart button
And user click on viewcart button
And user click on proced to check button
And user click on place order button
And user enter the card name
And user enter card number
And user enter cvc and expiration
And user click pay and confirm button
Then verify order placed message



    