@BookFlights
Feature: verifying the book flights feature

Background: check the home page is landed
Given user verifies if the home page is landed
And user verifies destination link

@BookFlightWithLowestPrice
Scenario Outline: Book the ticket for lowest priced flight
Given user searches for the flight <from> and <to>
And verifies if the flight results are appeared between <from> and <to>
When user selects the lowest priced flight
#And confirms the flight ticket
#Then verifies flight ticket is booked successfully

Examples: 
|from|to|
|Mexico City|London|