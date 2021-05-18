$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Aditya Kumar/Eclipse-R\u0026D-Workspace/Bdd/src/test/resources/features/googleSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Guru99 Primary Testing",
  "description": "",
  "id": "guru99-primary-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Guru99-Primary"
    }
  ]
});
formatter.before({
  "duration": 287829,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
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
  "duration": 23846699865,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Customer Login as Mohit",
  "description": "",
  "id": "guru99-primary-testing;customer-login-as-mohit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Customer Enters Credential and Login",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "New Customer \"Mohit Maane\" entered",
  "keyword": "When "
});
formatter.match({
  "location": "googleSearch.Customer_Launches_Application()"
});
formatter.result({
  "duration": 13294931545,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mohit Maane",
      "offset": 14
    }
  ],
  "location": "googleSearch.Customer_Clicks_on_Customer_Login_Button(String)"
});
formatter.result({
  "duration": 4139303706,
  "status": "passed"
});
formatter.after({
  "duration": 2488472339,
  "status": "passed"
});
formatter.before({
  "duration": 1109136,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
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
  "duration": 21092405953,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 13,
      "value": "#\tThen  Customer Log outs"
    }
  ],
  "line": 16,
  "name": "Customer Login as Chutiay",
  "description": "",
  "id": "guru99-primary-testing;customer-login-as-chutiay",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Customer Enters Credential and Login",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "New Customer \"Kaushik Ray\" entered",
  "keyword": "When "
});
formatter.match({
  "location": "googleSearch.Customer_Launches_Application()"
});
formatter.result({
  "duration": 12172769859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kaushik Ray",
      "offset": 14
    }
  ],
  "location": "googleSearch.Customer_Clicks_on_Customer_Login_Button(String)"
});
formatter.result({
  "duration": 5091818327,
  "status": "passed"
});
formatter.after({
  "duration": 4089918662,
  "status": "passed"
});
});