$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NSO_1BBO.feature");
formatter.feature({
  "line": 2,
  "name": "NSO_1BBO",
  "description": "",
  "id": "nso-1bbo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NSO_1BBO"
    }
  ]
});
formatter.before({
  "duration": 10775878349,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login to NSO and go to 1BBO",
  "description": "",
  "id": "nso-1bbo;login-to-nso-and-go-to-1bbo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@NSO_1BBO"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Login to NSO application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Navigate to 1BBO",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Navigate to Client Customization Page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select the client in for Customization",
  "rows": [
    {
      "cells": [
        "Region",
        "Country",
        "Client"
      ],
      "line": 11
    },
    {
      "cells": [
        "LATAM",
        "BRAZIL",
        "PG_UAT"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Create product group for client",
  "rows": [
    {
      "cells": [
        "Client",
        "GroupName"
      ],
      "line": 14
    },
    {
      "cells": [
        "PG_UAT",
        "Auto_Prod_Grp"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "NSO_LoginStep.Login_To_NSO_Application()"
});
formatter.result({
  "duration": 6337299965,
  "status": "passed"
});
formatter.match({
  "location": "NSO_1BBO_OrderManagement_CatalogM_Location.NavigateTo1BBO()"
});
formatter.result({
  "duration": 6848640705,
  "status": "passed"
});
formatter.match({
  "location": "NSO_1BBO_Client_Customize.Navigate_to_Client_Customization_Page()"
});
formatter.result({
  "duration": 60159307338,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//body[@id\u003d\u0027ext-element-1\u0027]/child::div[7]/descendant::div[8]/child::div/div/div/input\"}\n  (Session info: chrome\u003d75.0.3770.142)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.04 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027HIPUNL54742\u0027, ip: \u002710.55.165.60\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\INPBUR~1\\AppData\\Local\\Temp\\scoped_dir17288_27583}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d75.0.3770.142, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 3edabfce9690de2d7f1581c6a1323ccc\n*** Element info: {Using\u003dxpath, value\u003d//body[@id\u003d\u0027ext-element-1\u0027]/child::div[7]/descendant::div[8]/child::div/div/div/input}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat core.generic.WrapperFunctions.setText(WrapperFunctions.java:174)\r\n\tat com.nielsen.pageFactory.BBO_Client_Customize.dropCountry(BBO_Client_Customize.java:107)\r\n\tat com.nielsen.stepDefinitions.NSO_1BBO_Client_Customize.Navigate_to_Client_Customization_Page(NSO_1BBO_Client_Customize.java:21)\r\n\tat ✽.And Navigate to Client Customization Page(NSO_1BBO.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NSO_1BBO_Client_Customize.Select_client(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NSO_1BBO_Client_Customize.create_product_group(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4086303585,
  "status": "passed"
});
});