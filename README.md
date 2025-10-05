<div align='center'>

# Cucumber BDD Selenium TestNG Automation Project

<img width="1024" height="1024" alt="Image" src="https://github.com/user-attachments/assets/bac3521b-2b24-42ba-ac09-be7e7cda29db" />

</div>


## 📌 Overview

This is a **test automation project** developed using **Java**, **Selenium WebDriver**, **Cucumber BDD**, and **TestNG**.  
It automates the login functionality of the [VWO Application](https://app.vwo.com), testing both valid and invalid login scenarios.

The project also uses **Allure Reports** for clean and visual test reporting.

---

##  🛠️   Technologies & Tools Used

- ☕ **Java 21** - Programming Language
- 🌐 **Selenium WebDriver 4.10** - Web Automation Framework
- 🥒 **Cucumber Java 7.13** - BDD Framework
- 🧪 **Cucumber TestNG 7.13** - BDD Test Runner Integration
- ✅ **TestNG 7.8** - Testing Framework
- 📦 **Maven** - Build & Dependency Management Tool
- 📊 **Allure TestNG 2.23** - Advanced Test Reporting


---

## ✅ Test Scenarios Covered

| Scenario Type        | Description                                                             |
|----------------------|-------------------------------------------------------------------------|
| ✅ Valid Login        | Login using correct credentials — user lands on the **Dashboard** page |
| ❌ Invalid Login      | Login using incorrect credentials — error message is verified          |

---

## 📋 Allure Report

<div align='center'>
   
<img width="1919" height="1031" alt="Image" src="https://github.com/user-attachments/assets/78a7a7cf-83b3-464d-9f4e-7242e9addb4c" />

</div>

---

## 🗂️ Project Structure
```
🧪 Cucumber_BDD_Selenium_TestNG_Automation/
├── 🧾 src/
│   └── 🧪 test/
│       ├── 📁 java/
│       │   └── 🧠 com/
│       │       └── 🧬 LipiAutomation/
│       │           ├── 🚀 runner/
│       │           │   └── 📄 CucumberRunnerTests.java
│       │           └── 🧩 step/
│       │               └── 🎯 definitions/
│       │                   └── 📄 VWOLoginPageDef.java
│       └── 📚 resources/
│           └── 📝 VWOLogin.feature
│
├── 🗂️ target/                         # TestNG and Cucumber reports (auto-generated)
│
├── 📊 allure-results/                 # Allure raw test results
│
├── ⚙️ pom.xml                         # Maven config with all dependencies
│
├── 📄 testng.xml                      # TestNG suite XML (if used)
│
└── 📝 README.md                       # Project documentation (this file!)
```

## How to Run Tests
Follow these steps to clone, execute, and generate reports for the framework:
1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd <project-folder>
   ```
   
2. **Run tests using Maven**
   ```bash
   mvn clean test
   ```
   
3. **Generate and serve Allure report**
   ```bash
   allure serve allure-results
   ```




