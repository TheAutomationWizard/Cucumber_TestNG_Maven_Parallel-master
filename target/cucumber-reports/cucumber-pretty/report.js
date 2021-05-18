$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Aditya Kumar/Eclipse-R\u0026D-Workspace/Bdd/src/test/resources/features/googleSearch2.feature");
formatter.feature({
  "line": 2,
  "name": "Guru99 Secondary Testing",
  "description": "",
  "id": "guru99-secondary-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Guru99-Second"
    }
  ]
});
formatter.before({
  "duration": 8405152,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Launch website \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 16
    }
  ],
  "location": "googleSearch.setUp(String)"
});
formatter.result({
  "duration": 33870715564,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Customer Login as Nakul chacha",
  "description": "",
  "id": "guru99-secondary-testing;customer-login-as-nakul-chacha",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Customer Enters Credential and Login",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "New Customer \"Nakul chacha\" entered",
  "keyword": "When "
});
formatter.match({
  "location": "googleSearch.Customer_Launches_Application()"
});
formatter.result({
  "duration": 7336660931,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nakul chacha",
      "offset": 14
    }
  ],
  "location": "googleSearch.Customer_Clicks_on_Customer_Login_Button(String)"
});
formatter.result({
  "duration": 3246763928,
  "status": "passed"
});
formatter.after({
  "duration": 1778180231,
  "status": "passed"
});
formatter.before({
  "duration": 873744,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Launch website \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 16
    }
  ],
  "location": "googleSearch.setUp(String)"
});
formatter.result({
  "duration": 28287858382,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 14,
      "value": "#\tThen  Customer Log outs"
    }
  ],
  "line": 17,
  "name": "Customer Login as Rohit Bishoyi",
  "description": "",
  "id": "guru99-secondary-testing;customer-login-as-rohit-bishoyi",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Customer Enters Credential and Login",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "New Customer \"Rohit Bishoyi\" entered",
  "keyword": "When "
});
formatter.match({
  "location": "googleSearch.Customer_Launches_Application()"
});
formatter.result({
  "duration": 5932468101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rohit Bishoyi",
      "offset": 14
    }
  ],
  "location": "googleSearch.Customer_Clicks_on_Customer_Login_Button(String)"
});
formatter.result({
  "duration": 4165585554,
  "status": "passed"
});
formatter.after({
  "duration": 2727836519,
  "status": "passed"
});
});