Feature: Check Subcategories

  Scenario:User can view the specified fields in the subcategories page
    Given user is in the admin dashboard
    When user navigates to sub categories
    Then user can view the subcategories page

  Scenario:User can add a subcategory
    Given user is in the subcategory page
    When user selects a category
    And he adds a subcategory
    Then a success message is displayed

  Scenario:User can search a subcategory
    Given user is in the subcategory page
    When user search a subcategory
    Then he should be able to view that subcategory

  Scenario:User can edit a subcategory
    Given user is in the subcategory page
    When user selects on edit button of a subcategory
    Then he can edit the subcategory

  Scenario:User can delete a subcategory
    Given user is in the subcategory page
    When user clicks on delete button of a subcategory
    Then he should view a alert message
    And confirm delete successful

  Scenario:User can view the list by sorting with command and Sl. No
    Given user is in the subcategory page
    When user selects to sort by command
    Then he can view the list with commands

  Scenario:User can view all entries in one page
    Given user is in the subcategory page
    When user selects to view all
    Then he can view all entries in one pages

  Scenario:User can view the list by navigating to all pages
    Given user is in the subcategory page
    When user navigates to different pages
    Then he can view list in all pages