Feature: As a QA, I would like to verify all negative scenarios for login

  @wip
  Scenario: Select ‘Sign in’, and enter as many negative scenarios as possible. Verify that a error message is displayed and the text that it
  contains is as expected.
    Given user lands on the "Homepage" page
    When user clicks sign in button
    And user types "<keyword>" into input box and "<submitAction>"
    Then user should see "<errorMessage>"

    Examples:
      | keyword                                                                     | submitAction | errorMessage                                                                            |
      |                                                                             | enter        | Something's missing. Please check and try again.                                        |
      |                                                                             | clickNext    | Something's missing. Please check and try again.                                        |
      | wrongUserName                                                               | enter        | We don’t recognise that email or username. You can try again or register for an account |
      | wrongUserName                                                               | clickNext    | We don’t recognise that email or username. You can try again or register for an account |
      | wrongEmail@domain.com                                                       | enter        | We don’t recognise that email or username. You can try again or register for an account |
      | wrongEmail@domain.com                                                       | clickNext    | We don’t recognise that email or username. You can try again or register for an account |
      | wrongEmail@domain                                                           | enter        | Sorry, that email doesn’t look right. Please check it's a proper email.                 |
      | wrongEmail@domain                                                           | clickNext    | Sorry, that email doesn’t look right. Please check it's a proper email.                 |
      | userName withSpaceOrSpecialChars/()                                         | enter        | Usernames can only include... Letters, numbers and these characters: ?/\|}{+=_-^~`%$#   |
      | userName withSpaceOrSpecialChars/()                                         | clickNext    | Usernames can only include... Letters, numbers and these characters: ?/\|}{+=_-^~`%$#   |
      | a                                                                           | enter        | Sorry, that username's too short. It needs to be at least two characters.               |
      | a                                                                           | clickNext    | Sorry, that username's too short. It needs to be at least two characters.               |
      | tooLongUserNametooLongUserNametooLongUserNametooLongUserNametooLongUserName | enter        | Sorry, that username's too long. It can't be more than 50 characters.                   |
      | tooLongUserNametooLongUserNametooLongUserNametooLongUserNametooLongUserName | clickNext    | Sorry, that username's too long. It can't be more than 50 characters.                   |