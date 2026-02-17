# Test Automation Framework — Java Maven | Selenium 4 | Cucumber BDD (by Habiburrahman Ahmadi)

This repository contains an **automation testing** project built with **Java + Maven** using:
- **Selenium 4** (via Selenium BOM)
- **Cucumber (BDD)**
- **JUnit**
- **WebDriverManager** (auto-manage driver browser)

## Tech Stack & Versions
- **Java**: 11
- **Maven**: 3.x
- **Selenium**: `4.25.0` (managed by `selenium-bom`)
- **Cucumber**: `7.14.0`
- **WebDriverManager**: `5.6.2`
- **Test Runner**: `cucumber-junit`

##  Prerequisites
Make sure you have installed:
- **JDK 11**
- **Maven**
- **A supported browser (Chrome/Firefox/Edge)**

## Contribution
step-by step:
1. **Fork this repository**
2. **Create a feature branch: feature/nama-fitur**
3. **Commit your changes**
4. **Create a Pull Request**

## Install Dependencies
mvn clean install
## Run a specific runner
mvn -Dtest=TestRunner test
## Run by tag (optional)
mvn test -Dcucumber.filter.tags="@smoke"

Check installed versions:
```bash
java -version
mvn -version

Project Structure

AutomationProjectsRepository
├─ .idea/                          # IntelliJ IDEA config (local)
├─ src/
│  ├─ main/
│  │  └─ java/
│  │     ├─ base/                  # Base classes (driver init/base page, etc.)
│  │     ├─ locators/              # Locator selectors (By/XPath/CSS)
│  │     ├─ pages/                 # Page Object Model (POM)
│  │     └─ utils/                 # Helpers/utilities (config reader, waits, etc.)
│  └─ test/
│     ├─ java/
│     │  ├─ hooks/                 # Cucumber hooks (Before/After, setup/teardown)
│     │  ├─ runner/                # Cucumber runner (JUnit)
│     │  └─ steps/                 # Step definitions (Given/When/Then)
│     └─ resources/
│        ├─ config/                # Configuration files (env, baseUrl, browser, etc.)
│        ├─ features/              # .feature files (Gherkin)
│        └─ testdata/              # Test data (json/csv/xlsx/etc.)
├─ target/                         # Maven build output (generated)
└─ pom.xml                         # Maven dependencies & configuration

