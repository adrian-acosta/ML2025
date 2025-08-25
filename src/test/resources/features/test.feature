Feature: Search products on website

 Scenario: Search for PlayStation 5 and filter results
  Given I open the website Mercado Libre
  When I select "México" as country
  And I search for "playstation 5"
  And I filter by condition "Nuevo"
  And I filter by location "Local" 
  And I order results by "mayor a menor precio"
  Then I obtain the first 5 products