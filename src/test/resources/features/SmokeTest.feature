Feature: this feature is for smoke tests

  @smoke
  Scenario: Smoke test
    Given I print hello world
    Then everybody can see

    @regression
    Scenario: This is for Cucumber Test
      Given I run cucumber test
      Then verify this is cucumber