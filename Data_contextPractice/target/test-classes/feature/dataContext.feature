Feature: Validate the login functionality of ESS application

  Scenario Outline: Validate the login functionality with valid credentials
    Given User should launch the ESS application
    And User retrives the required data from "<DataKey>" and "<Sheetname>" and "<Filepath>"
    When User enters the credentials and clicks on submit button
    Then User should navigates to the dashboard

    Examples: 
      | DataKey | Sheetname   | Filepath                                                                                                     |
      | Vicky   | Credentials | C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\Data_contextPractice\\src\\test\\resources\\utils\\Ess.xlsx |
      #| Siva    | Credentials | C:\\Users\\Vignesh.sakthivel\\eclipse-workspace\\Data_contextPractice\\src\\test\\resources\\utils\\Ess.xlsx |
