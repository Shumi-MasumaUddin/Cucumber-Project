@sc2
Feature:  user want to visit amazon web page and verify serch

 In order to verify serch 
 as a register user 
 i want to visit amazon web page and write a text in search box then search
  
 Scenario Outline: 
 Given   user visits amazon home page
 And     user search by "<productname>" 
 Then    user clicks on search button
Examples:

| productname       | 
| iphone 12 pro max |