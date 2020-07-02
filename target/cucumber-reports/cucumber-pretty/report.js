$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Test Environment",
  "description": "",
  "id": "login-to-test-environment",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7274261200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on TEST Environment page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefiniton.user_is_on_TEST_Environment_page()"
});
formatter.result({
  "duration": 1121347800,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Login to MyAccount",
  "description": "",
  "id": "login-to-test-environment;login-to-myaccount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@loginTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User click on MyAccount",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters username \u0027sdet@tekschool.us\u0027 and Password \u0027sdet\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Should be logged in to user Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefiniton.user_click_on_MyAccount()"
});
formatter.result({
  "duration": 287531900,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefiniton.user_click_on_Login()"
});
formatter.result({
  "duration": 382882100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sdet@tekschool.us",
      "offset": 22
    },
    {
      "val": "sdet",
      "offset": 55
    }
  ],
  "location": "loginStepDefiniton.user_enters_username_sdet_tekschool_us_and_Password_sdet(String,String)"
});
formatter.result({
  "duration": 354633400,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefiniton.user_click_on_Login_button()"
});
formatter.result({
  "duration": 367350200,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefiniton.user_Should_be_logged_in_to_user_Dashboard()"
});
formatter.result({
  "duration": 10506100,
  "status": "passed"
});
formatter.after({
  "duration": 1819533300,
  "status": "passed"
});
});