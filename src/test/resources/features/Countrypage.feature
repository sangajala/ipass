Feature: Country page features

  Scenario Outline: User can login to landing page

    Given an admin is in landing page
    And he goto the country page
    When he search "<country>"
    Then he should see the <result>
    Examples:
      | country | result |
      | UK      | 1      |

  Scenario Outline: User can login to landing page

    Given an admin is in landing page
    And he goto the country page
    When he search "<country>"
    Then he should see the <result>
    Examples:
      | country              | result |
      | ["e-command-header"] | 0      |
      | ["-command-header"]  | 0      |
      | Mumbai               | 0      |
