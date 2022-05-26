Feature: feature to test background colors

Scenario: Change color to SkyBlue
    Given Set SkyBlue Background button exists
    When user click on the skyblue button
    Then the background color will change to sky blue

Scenario: Change color to SkyWhite
    Given Set SkyWhite Background button exists
    When user click on the skywhite button
    Then the background color will change to sky white
