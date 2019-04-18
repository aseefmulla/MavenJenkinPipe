$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login with invalid credential",
  "description": "",
  "id": "facebook-login;login-with-invalid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user open the browser and launch facebook application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters username \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "application displays user and pass is incorrect",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "facebook-login;login-with-invalid-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "facebook-login;login-with-invalid-credential;;1"
    },
    {
      "cells": [
        "abdf",
        "werty"
      ],
      "line": 13,
      "id": "facebook-login;login-with-invalid-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login with invalid credential",
  "description": "",
  "id": "facebook-login;login-with-invalid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user open the browser and launch facebook application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters username abdf",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters password werty",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "application displays user and pass is incorrect",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_open_the_browser_and_launch_facebook_application()"
});
formatter.result({
  "duration": 30874103359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abdf",
      "offset": 21
    }
  ],
  "location": "LoginStep.user_enters_username_abdf(String)"
});
formatter.result({
  "duration": 1685655766,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "werty",
      "offset": 21
    }
  ],
  "location": "LoginStep.user_enters_password_werty(String)"
});
formatter.result({
  "duration": 93226030,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 6168667183,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.application_displays_user_and_pass_is_incorrect()"
});
formatter.result({
  "duration": 1237582691,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.close_the_browser()"
});
formatter.result({
  "duration": 2315101037,
  "status": "passed"
});
});