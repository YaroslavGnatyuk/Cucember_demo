Feature: Book search by author
  To allow a customer to find his favourite books quickly, the library must offer multiple ways to search for a book.

  Scenario: Search books by author
    Given a book with the title 'New book', written by 'Tim Tomson', published in 14 March 2013
      And another book with the title 'Some other book', written by 'Tim Tomson', published in 23 August 2014
      And another book with the title 'How to cook a dino', written by 'Fred Flintstone', published in 01 January 2012
    When the customer searches for books written by 'Tim Tomson'
    Then 2 books should have been found