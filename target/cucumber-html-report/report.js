$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/htcproducts.feature");
formatter.feature({
  "name": "Customer looking for HTC products",
  "description": "  As a customer,\n  I want to find HTC products on that site\n  so that I can see all HTC products you have",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid search of products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@vladimira"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the shoppragmatic home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HTCProductsStepDef.theUserIsOnTheShoppragmaticHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user writes \"HTC\" in Search field",
  "keyword": "When "
});
formatter.match({
  "location": "HTCProductsStepDef.theUserWritesInSearchField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks search button",
  "keyword": "And "
});
formatter.match({
  "location": "HTCProductsStepDef.theUserClicksSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ensure positive message appears \"Showing 1 to 1 of 1 (1 Pages)\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HTCProductsStepDef.ensurePositiveMessageAppears(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid search of products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@vladimira"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the shoppragmatic home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HTCProductsStepDef.theUserIsOnTheShoppragmaticHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user writes \"HTCC\" in Search field",
  "keyword": "When "
});
formatter.match({
  "location": "HTCProductsStepDef.theUserWritesInSearchField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks search button",
  "keyword": "And "
});
formatter.match({
  "location": "HTCProductsStepDef.theUserClicksSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ensure negative message appears \"There is no product that matches the search criteria.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HTCProductsStepDef.ensureNegativeMessageAppears(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});