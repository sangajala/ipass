Feature: Category page information

  @geomon
  Scenario: User can access the Categories page
    Given as admin is in the landing page
    When he navigates to the Categories page
    Then he should be in the Categories page


  Scenario Outline:User can add a new Category in the Category list
    Given as admin is in the Categories page
    When he mention a "<CategoryName>" in ADD CATEGORY
    And he press "ADD"
    Then it should show "Done Successfully"
    Then the categories should apper
    Examples:
      | CategoryName        |
      | Management studies  |
      | Seismology Studies  |
      | Meteorology Studies |


  Scenario Outline:User can add a new category in the Category List with negative values
    Given as admin is in the Categories page
    When he mention a name "<CategoryName>" in ADD CATEGORY
    And add it
    Then it should not add it
    Examples:
      | CategoryName |
      | >.,>..??     |
      | ...          |
      | *)(*&^%      |
      | &&&&&&%%%%   |

  Scenario: User adds a Category with the existing Name in the Category
    Given as admin is in the Categories page
    When he provide the "Meteorology Studies" in ADD CATEGORY
    And he press "ADD"
    Then it should not add it
#    Then it should show "Category name already exist"


  Scenario Outline:User can  Search a category in the search field

    Given an admin is in the Categories page
    And Add a category "Studies"
    When he search "<CategoryName>" in the search field
    Then the categories should apper
    And delete all new category
    Examples:
      | CategoryName        |
      | Studies             |
      | studies             |
      | management studies  |
      | seismology studies  |
      | meteorology studies |


  Scenario Outline:User can  search a category in the search field with negative values

    Given an admin is in the Categories page
    When he search "<CategoryName>" in the search field
    Then it should show "No results found!"

    Examples:
      | CategoryName          |
      | 1                     |
      |                       |
      | $$Bordersecurityforce |
      | (9()-__               |
      | $$$$$$$$$$$$$$$       |
      | ^^^^^^                |


  Scenario Outline:User can  modify  a category

    Given as admin is in the Categories page
    When he uses the edit option for the corresponding category
    And he can change its name "<newName>" and save it
    Then it should show "Done Successfully"
    Examples:
      | newName                                      |
      | Management Studies in Hospital Adminstration |
      | Selenium Tutorials                           |
      | Hosptitality Management                      |


  Scenario Outline:User can modify a category with Negative values

    Given as admin is in the Categories page
    When he uses the edit option for the corresponding category
    And he can change its name "<newName>" and save it
    Then it should show "invalid Category name"
    Examples:
      | newName    |
      | >.,>..??   |
      | ...        |
      | ****^^^*** |

  Scenario Outline:User can see SerialNo and Commands column information in the category list

    Given as admin is in the Categories page
    When he select both the "<Sno>" and "<Commands>" from the square pattern icon
    Then it should show in the CategoryList
    Examples:
      | Sno   | Commands |
      | true  | true     |
      | true  | false    |
      | false | true     |
      | false | false    |


  Scenario Outline: User can Select the Number of items to display in the List

    Given as admin is in the Categories page
    When he selects a "<noItemToDisplay>"from the List
    Then the displayed items number should be less than or equal to "<noItemToDisplay>"
    Examples:
      | noItemToDisplay |
      | 10              |
      | 25              |
      | 50              |
      | All             |

  Scenario Outline: User can navigate through the pages
    Given as admin is in the Categories page
    When he use "<pageSelection>" option
    Then that page should  appear
    Examples:
      | pageSelection |
      | FirstPage     |
      | NextPage      |
      | PreviousPage  |
      | LastPage      |

  Scenario:User can delete a category
    Given as admin is in the Categories page
    When he delete a category"Computer Science"
    Then that Category should be deleted



  Scenario Outline:User can sort the category list
    Given as admin is in the Categories page
    When he press the "<columnInfo>" in the Category List
    Then the page should be sorted
    Examples:
      | columnInfo |
      | CAT NAME   |
      | SNO        |


