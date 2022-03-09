$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As a user I want to login into HeartBingo website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should not login with invalid credentials",
  "description": "",
  "id": "login-test;user-should-not-login-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \"Log In\" login link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter username \"\u003cusername\u003e\" at username field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter password \"\u003cpassword\u003e\" at password field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on  login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see the errormessage",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I close login frame",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-test;user-should-not-login-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "login-test;user-should-not-login-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "abcd123@gmail.com",
        "xyz123"
      ],
      "line": 14,
      "id": "login-test;user-should-not-login-with-invalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6498169500,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should not login with invalid credentials",
  "description": "",
  "id": "login-test;user-should-not-login-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \"Log In\" login link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter username \"abcd123@gmail.com\" at username field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter password \"xyz123\" at password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on  login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see the errormessage",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I close login frame",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.i_am_on_homepage()"
});
formatter.result({
  "duration": 144855200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log In",
      "offset": 12
    }
  ],
  "location": "LoginStepdefs.iClickOnLoginLink(String)"
});
formatter.result({
  "duration": 206904200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd123@gmail.com",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterUsernameAtUsernameField(String)"
});
formatter.result({
  "duration": 1627721600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz123",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterPasswordAtPasswordField(String)"
});
formatter.result({
  "duration": 3157579800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 3053637000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iShouldSeeTheErrormessage()"
});
formatter.result({
  "duration": 264689700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iCloseLoginFrame()"
});
formatter.result({
  "duration": 129327000,
  "status": "passed"
});
formatter.after({
  "duration": 780248500,
  "status": "passed"
});
});