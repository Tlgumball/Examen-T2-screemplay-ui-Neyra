Feature: User Registration

  Scenario: Successful registration with valid data
    Given the user navigates to the register page
    When the user fills the form with first name "Estefano", last name "Neyra", email "202122378prueba11@cibertec.pe", phone "922363491" and password "Test@12345"
    And accepts the privacy policy
    And clicks on continue
    Then the user should see the message "Your Account Has Been Created!"






