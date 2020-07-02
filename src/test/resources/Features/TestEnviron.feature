Feature: Test Environment 

@registerTest
Scenario:
Given User is on Test Environment page
When user click on MyAcount
And User click on Register 
And User fills Register form with below information
|firstName|LastName|E-mail|Telephone|password|
 |James|Bond|jbond2323@test.com|1530105361|jamesbond|
 And User select 'yes' for Subscribe 
 And User click privacy and policy button
 And User click Continue button 
 Then User should see message 'Your Account has been created' 
 
 