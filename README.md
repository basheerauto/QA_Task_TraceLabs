# QA_Task_TraceLabs
<table width="708">
<tbody>
<tr>
<td width="708">
<p><strong>QA-Task Testing the Etherscan Registration form</strong></p>
</td>
</tr>
</tbody>
</table>
<table style="width: 1037px;">
<tbody>
<tr>
<td style="width: 145.16px;">
<p><strong>Task description</strong></p>
</td>
<td style="width: 875.84px;">
<p>To Verify customer, enter registration form details to create new Account in Etherscan website&nbsp;</p>
<p>a)Create TEST SCENARIOS for the registration form on Etherscan website (<a href="https://etherscan.io/register" data-saferedirecturl="https://www.google.com/url?q=https://etherscan.io/register&amp;source=gmail&amp;ust=1639282390361000&amp;usg=AOvVaw2eMiOkxwvkzUBwkhCj8Cb8">https://etherscan.io/register</a>)</p>
<p>b)Explain what type of tools you would use to enable an automatic testing system for the task above and how they would be utilized.</p>
<p>c)Create E2E browser tests that will cover all test scenarios&nbsp;</p>
</td>
</tr>
<tr>
<td style="width: 145.16px;">
<p><strong>Features To be tested</strong></p>
</td>
<td style="width: 875.84px;">
<p><strong>Feature</strong>:Verify customer registration form on Etherscan website<br /> &nbsp;&nbsp;<strong>Background</strong>:<br /> &nbsp;&nbsp;&nbsp; <strong>When </strong>I open Etherscan website<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>I validate title and URL<br /> &nbsp; @Smoketest<br /> &nbsp;<strong>Scenario Outline</strong>:Verify customer enter registration form details to create new Account in Etherscan website<br /> &nbsp;&nbsp;&nbsp; <strong>When </strong>Tescase"<strong>&lt;TCNum&gt;</strong>" number and Testcase Description "<strong>&lt;TCDesc&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>Given </strong>enter Username name as "<strong>&lt;Username&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>enter Email Address as "<strong>&lt;Email Address&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>enter Password as "<strong>&lt;Password&gt;</strong>" and Confirm Password as "<strong>&lt;Confirm Password&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>I agree to the Terms and Conditions "<strong>&lt;Termcheck&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>click Create an Account button "<strong>&lt;TCNum&gt;</strong>"<br /> <br /> &nbsp;&nbsp;&nbsp; <strong>Examples</strong>:<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <strong>|</strong><em>TCNum&nbsp; </em><strong>|</strong><em>TCDesc&nbsp;&nbsp;&nbsp;&nbsp; </em><strong>|</strong><em>Username&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </em><strong>|</strong><em>Email Address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </em><strong>|</strong><em>Password&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </em><strong>|</strong><em>Confirm Password&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </em><strong>|</strong><em>Termcheck</em><strong>|<br /> &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;|</strong><strong>TC_01&nbsp; </strong><strong>|</strong><strong>Verify user enter all field values and verify invalid Captcha error&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp; </strong><strong>Test123&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp;&nbsp; </strong><strong>test1@gmail.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp;&nbsp;&nbsp; </strong><strong>Test1234&nbsp;&nbsp;&nbsp; </strong><strong>| </strong><strong>Test1234&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|</strong><strong>Yes&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</strong><strong>TC_02&nbsp; </strong><strong>|</strong><strong>verify error Submit registration form without filled any filed values&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</strong><strong>TC_03&nbsp; </strong><strong>|</strong><strong>verify error user Enter Username field with &lt;5 character&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp; </strong><strong>Test&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp;&nbsp; </strong><strong>test1@gmail.com&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;</strong><strong>|&nbsp;&nbsp;&nbsp; </strong><strong>Test1234&nbsp;&nbsp;&nbsp; </strong><strong>| </strong><strong>Test1234&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|</strong><strong>Yes&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</strong><strong>TC_04&nbsp; </strong><strong>|</strong><strong>verify error user entering invalid Email address format&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp; </strong><strong>Test123&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp;&nbsp; </strong><strong>test1gmail.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp;&nbsp;&nbsp; </strong><strong>Test1234&nbsp;&nbsp;&nbsp; </strong><strong>| </strong><strong>Test1234&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|</strong><strong>Yes&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</strong><strong>TC_05&nbsp; </strong><strong>|</strong><strong>verify error user enter password does not match&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp; </strong><strong>Test123&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp;&nbsp; </strong><strong>test1@gmail.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp;&nbsp;&nbsp; </strong><strong>Test123&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>| </strong><strong>Test1234&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|</strong><strong>Yes&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</strong><strong>TC_06&nbsp; </strong><strong>|</strong><strong>verify error user enter username with special character&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong><strong>|&nbsp; </strong><strong>Test123$&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp;&nbsp; </strong><strong>test1@gmail.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|&nbsp;&nbsp;&nbsp; </strong><strong>Test1234&nbsp;&nbsp;&nbsp; </strong><strong>| </strong><strong>Test1234&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|</strong><strong>Yes&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>|</strong></p>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td style="width: 145.16px;">
<p><strong>Framework</strong></p>
</td>
<td style="width: 875.84px;">
<p><strong>BDD framework</strong></p>
</td>
</tr>
<tr>
<td style="width: 145.16px;">
<p><strong>Framework Design Tools</strong></p>
</td>
<td style="width: 875.84px;">
<p><strong>Java 1.8 , </strong></p>
<p><strong>BDD Cucumber, Selenium, Maven, JVM Cucumber Report and POM Pattern</strong></p>
</td>
</tr>
<tr>
<td style="width: 145.16px;">
<p><strong>Version Control</strong></p>
</td>
<td style="width: 875.84px;">
<p><strong>Git Repo URL:</strong> <strong><a href="https://github.com/basheerauto/QA_Task_TraceLabs.git">https://github.com/basheerauto/QA_Task_TraceLabs.git</a></strong></p>
</td>
</tr>
<tr>
<td style="width: 145.16px;">
<p><strong>Author </strong></p>
</td>
<td style="width: 875.84px;">
<p>Basheer Ahamed</p>
</td>
</tr>
<tr>
<td style="width: 145.16px;">
<p><strong>Document Version</strong></p>
</td>
<td style="width: 875.84px;">
<p>Ver:0.1</p>
</td>
</tr>
<tr>
<td style="width: 145.16px;">
<p><strong>Command prompts Run </strong></p>
</td>
<td style="width: 875.84px;">
<p><strong>mvn clean test&nbsp; &nbsp; &nbsp;(Default its run in chrome Browser )</strong></p>
<p><strong>mvn clean test -Dbrowser=firefox&nbsp; &nbsp;(It will run in firefox browser)</strong></p>
</td>
</tr>
<tr>
<td style="width: 145.16px;">
<p><strong>Browser support</strong></p>
</td>
<td style="width: 875.84px;">Chrome Driver Browser, Firefox</td>
</tr>
<tr>
<td style="width: 145.16px;">
<p><strong>Test Report path</strong></p>
</td>
<td style="width: 875.84px;"><strong>HTML Report</strong>: Project folder path-->target/Cucumber-html-report/index.html<br /><strong>JVM Cucumber Report</strong>: Project Folder path->target/Cucumber-JVM-Reports/cucumber-html-reports/feature-overview.html</td>
</tr>
<tr>
<td style="width: 145.16px;">
<p><strong>Not Automated</strong></p>
</td>
<td style="width: 875.84px;">
<p><strong>Google Captcha component- Security </strong></p>
<p><strong>Solution: Run automation scripts in non-production environment for testing.</strong></p>
</td>
</tr>
</tbody>
</table>
