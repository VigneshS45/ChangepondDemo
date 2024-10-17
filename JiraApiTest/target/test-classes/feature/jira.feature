Feature: Test the create issue functionality in jira application

  Scenario Outline: Validate create issue functionality by posting the request body
    Given User retrive the testdata from "<DataKey>" and "<Sheetname>" and "<Filepath>"
    When User hits the required end point with payloads
    Then User should validate the status code
    Examples: 
      | DataKey | Sheetname | Filepath                                                                                            |
      | create1 | Sheet1    | C:\Users\Vignesh.sakthivel\eclipse-workspace\JiraApiTest\src\test\resources\utils\jiraTestdata.xlsx |
