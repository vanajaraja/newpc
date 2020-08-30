$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/LoginFeature.feature");
formatter.feature({
  "name": "Testing the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test the FB lgin page with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User hould be in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_hould_be_in_login_page()"
});
