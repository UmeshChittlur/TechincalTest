Feature: To verify given vehicle has the right insurance

 @VerifyVehicle
 Scenario: Test to check any vehicle's valid insurance
     Given the user open the Dealer Portal URL
     When the VOLKSWAGEN FINANCIAL SERVICES page displays
     Then I enter the Vehicle Registration number in Vehicle registration text box
     And I click on the Find vehicle button
     Then I verify the result for the Registered vehicle
