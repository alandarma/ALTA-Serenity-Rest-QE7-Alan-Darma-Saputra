Feature: Looking up post codes
 @skenario1
  Scenario Outline: Looking up US locations by post code
    When I look up a post code <Post Code> for country code <Country Code>
    Then the resulting location should be <Place Name> in <Country>
    Examples:
      | Post Code | Country Code | Country       | Place Name    |
      | 10000     | US           | United States | New York City |
      | 90210     | US           | United States | Beverly Hills |
      | 13001     | FR           | France        | Marseille 01  |
 @skenario2
 Scenario Outline: Looking up US Location by post code TEST-1
   When I look up a post code <Post Code> for country code <Country Code>
   Then the resulting location should be <Place Name> in <Country>
   Examples:
     | Post Code | Country Code | Country       | Place Name    |
     | 10000     | US           | United States | New York City |
