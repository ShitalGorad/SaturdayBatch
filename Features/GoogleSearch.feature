Feature: Google Search

  @tag1
  Scenario Outline: Verify the Google Search functionality
    Given Launch Browser And open Google site.
    When Enter "<products>" in search field & click on search button .
    Then validate the "<titles>"

    Examples: 
      | products     | titles                       |
      | Lipstick    | Lipstick - Google Search    |
      | Women wears | Women wears - Google Search |
      | watch       | watch - Google Search       |
      | shoes       | shoes - Google Search       |
      | jewellery   | jewellery - Google Search   |
      | kind man    | kind man - Google Search    |
