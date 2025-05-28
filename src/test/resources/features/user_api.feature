Feature: User API Testing
  As a user
  I want to verify the user API endpoint
  So that I can ensure it returns the correct response

  Scenario: Verify successful response from users API
    When I send a GET request to "https://reqres.in/api/users?page=2"
    Then the response status code should be 200 