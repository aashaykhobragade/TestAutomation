$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotelbooking.feature");
formatter.feature({
  "line": 2,
  "name": "Cleartrip hotelbooking validations",
  "description": "",
  "id": "cleartrip-hotelbooking-validations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Cleartrip hotelbooking test Scenario",
  "description": "",
  "id": "cleartrip-hotelbooking-validations;cleartrip-hotelbooking-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on cleartip page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Hotels tab",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters City in Where feild",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters Check-in and Check-out details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User selects Travellers",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks Search hotels",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginstepdefination.user_on_cleartip_page()"
});
formatter.result({
  "duration": 6737555308,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Cleartrip login validations",
  "description": "",
  "id": "cleartrip-login-validations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Cleartrip login test Scenario",
  "description": "",
  "id": "cleartrip-login-validations;cleartrip-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on cleartip page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of the login page in cleartrip",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on your Trips icon and Sign In button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks Sign In button in pop up",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Error message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginstepdefination.user_on_cleartip_page()"
});
formatter.result({
  "duration": 6586746159,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefination.title_of_the_login_page_in_cleartrip()"
});
formatter.result({
  "duration": 12367508,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Cleartrip]\u003e but was:\u003c[title]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepdefination.loginstepdefination.title_of_the_login_page_in_cleartrip(loginstepdefination.java:43)\r\n\tat ✽.When Title of the login page in cleartrip(login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "loginstepdefination.user_click_signinbutton_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginstepdefination.errormsg_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});