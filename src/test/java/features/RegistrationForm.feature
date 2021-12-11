Feature:Verify customer registration form on Etherscan website

  Background:
    When I open Etherscan website
    Then I validate title and URL

  @Smoketest
 Scenario Outline:Verify customer enter registration form details to create new Account in Etherscan website
    When Tescase"<TCNum>" number and Testcase Description "<TCDesc>"
    Given enter Username name as "<Username>"
    Then enter Email Address as "<Email Address>"
    Then enter Password as "<Password>" and Confirm Password as "<Confirm Password>"
    Then I agree to the Terms and Conditions "<Termcheck>"
    Then click Create an Account button "<TCNum>"

    Examples:
      |TCNum  |TCDesc                                                                   |Username         |Email Address             |Password        |Confirm Password        |Termcheck|
      |TC_01  |Verify user enter all field values and verify invalid Captcha error      |  Test123        |   test1@gmail.com        |    Test1234    | Test1234               |Yes      |
      |TC_02  |verify error Submit registration form without filled any filed values    |                 |                          |                |                        |         |
      |TC_03  |verify error user Enter Username field with <5 character                 |  Test           |   test1@gmail.com        |    Test1234    | Test1234               |Yes      |
      |TC_04  |verify error user entering invalid Email address format                  |  Test123        |   test1gmail.com         |    Test1234    | Test1234               |Yes      |
      |TC_05  |verify error user enter password does not match                          |  Test123        |   test1@gmail.com        |    Test123     | Test1234               |Yes      |
      |TC_06  |verify error user enter username with special character                  |  Test123$       |   test1@gmail.com        |    Test1234    | Test1234               |Yes      |

