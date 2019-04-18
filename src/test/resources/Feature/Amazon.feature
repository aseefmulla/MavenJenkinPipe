Feature: Amazon application Test

  Scenario: Login Amazon
    Given user open browser and launch amazon application
    When user click on login page
    Then amazon login page displayed
    And close amazon site

  Scenario Outline: Search criteria
    Given user open browser and launch amazon application
    And user selects <dropdown>
    And user enter <searchvalue>
    When user click on submit button of amazon
    Then application display <searchvalue> result for search
    And close amazon site

    Examples: 
      | dropdown | searchvalue |
      | Books    | freedom     |
      | Baby     | soap        |
