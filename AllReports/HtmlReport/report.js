$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Admin/eclipse-workspace/CucumberJava/src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "          To Validate the login with invalid username and valid password",
  "keyword": "Scenario"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter  invalid username and valid password",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "email"
      ]
    },
    {
      "cells": [
        "java",
        "123456",
        "sst123@gmail.com"
      ]
    },
    {
      "cells": [
        "oracle",
        "98765",
        "java123@gmail.com"
      ]
    },
    {
      "cells": [
        ".net",
        "pytho",
        "selenium456@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_invalid_username_and_valid_password(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#emailId\"}\n  (Session info: chrome\u003d122.0.6261.131)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.20\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [ffdc03ad3b9d9fb91e2d18ef2009ae27, findElement {using\u003did, value\u003demailId}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 122.0.6261.131, chrome: {chromedriverVersion: 122.0.6261.128 (f18a44fedeb..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:64149}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:64149/devtoo..., se:cdpVersion: 122.0.6261.131, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: ffdc03ad3b9d9fb91e2d18ef2009ae27\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:66)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat org.stepdefinition.StepDefinition.user_have_to_enter_invalid_username_and_valid_password(StepDefinition.java:29)\r\n\tat ✽.User have to enter  invalid username and valid password(file:/C:/Users/Admin/eclipse-workspace/CucumberJava/src/test/resources/Feature/Login.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to reach invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_reach_invalid_credential_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});