@Login @Regression
Feature: Login with valid credentials

  @Positive @Success @Regression @Smoke @Sanity
  Scenario Outline: Login successfully
    Given agent is on login page
    And agent input valid email <email>
    And agent input valid password <password>
    When agent click sign in button
    Then agent see booking concierge logo in the dashboard

    Examples: 
      |email  				  | password  |
      |dzaky@ccn.com.sg | password	| 
      