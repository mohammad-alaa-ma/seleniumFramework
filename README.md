# Selenium Framework Project

This project is a Selenium-based automation framework using Java, Maven, TestNG, and Page Object Model (POM). It incorporates both Behavior-Driven Development (BDD) and Data-Driven Testing (DDT) methodologies.

## Tech Stack

- Selenium Java
- Maven
- TestNG
- BDD (Behavior-Driven Development)
- DDT (Data-Driven Testing)
- Headless Testing
- Integrating Selenium scripts and Jenkins CI server
- Selenium Grid
- SauceLabs
- Running Allure Reports With Selenium Framework
- Running Selenium Tests Using Jenkins Pipeline
- Integrating Jenkins With Slack

### Demos

## Running Selenium Test cases
https://github.com/mohammad-alaa-ma/Selenium-Framework/assets/173278906/ef271894-e278-4b86-9a88-f38543b20a4b

## Integrating Selenium scripts and Jenkins CI Server 
https://github.com/mohammad-alaa-ma/Selenium-Framework/assets/173278906/6698926d-1b69-426e-b9a8-d68a4f2ac1da 

## Running scripts on cloud using SauceLabs
https://github.com/mohammad-alaa-ma/Selenium-Framework/assets/173278906/f7aa36ce-128e-41dc-8884-d5564d0a3c89

## Run Allure Reports with Selenium Framework
https://github.com/mohammad-alaa-ma/Selenium-Framework/assets/173278906/a441b7a5-4def-456b-891b-10cc829f185d 

## Integrating Jenkins with Slack Notification
https://github.com/mohammad-alaa-ma/Selenium-Framework/assets/173278906/30f887c1-4eb1-447b-b5a9-9b35b35c8630


## Technologies Overview

### Selenium Java
- **Web Automation**: Automates web browsers for testing purposes using Java.
- **Cross-Browser Testing**: Supports testing across different browsers (Chrome, Firefox, Safari, etc.).
- **Element Interaction**: Allows interaction with web elements (clicks, inputs, selections).
- **Assertions and Verifications**: Validates expected behavior against actual results in web applications.

### Maven
- **Build Automation**: Manages project dependencies and builds Java-based projects.
- **Project Management**: Provides a uniform build system and project structure.
- **Dependency Management**: Simplifies the inclusion of external libraries and dependencies.

### TestNG
- **Test Framework**: A testing framework for Java inspired by JUnit and NUnit.
- **Annotations**: Provides annotations (@Test, @BeforeTest, @AfterTest) for test methods and setup/teardown actions.
- **Parameterization**: Supports data-driven testing using @DataProvider.
- **Parallel Execution**: Enables parallel execution of tests for faster test runs.
- **Assertions**: Built-in assertions and reporting.

### BDD (Behavior-Driven Development) with Cucumber
- **Scenario-Writing**: Uses Gherkin syntax (Given-When-Then) to write scenarios in a human-readable format.
- **Step Definitions**: Maps Gherkin steps to Java methods using step definitions.
- **Reusable Steps**: Encourages reusability of steps across scenarios.
- **Living Documentation**: Automatically generates documentation from feature files.
- **Collaboration**: Facilitates collaboration between stakeholders and development teams.

### DDT (Data-Driven Testing)
- **Parameterization**: Uses external data sources (CSV, Excel, databases) to drive test cases.
- **Variety of Input Data**: Tests different combinations of input data without changing the test logic.
- **Maintainability**: Separates test logic from test data, making tests easier to maintain.

### Headless Testing
- **Browser Testing Without GUI**: Executes tests without launching a browser GUI.
- **Efficiency**: Faster test execution and lower resource consumption.
- **CI/CD Integration**: Ideal for continuous integration pipelines where GUI interaction isn't necessary.

### Integrating Selenium Scripts and Jenkins CI Server
- **Automation Pipelines**: Runs Selenium tests automatically as part of CI/CD pipelines.
- **Scheduled Builds**: Triggers builds based on schedule or events (e.g., code commits).
- **Reporting**: Provides detailed test reports and integration with other CI/CD tools.
- **Notifications**: Sends notifications for build statuses and test results.

### Selenium Grid
- **Distributed Testing**: Runs Selenium tests across multiple machines and browsers in parallel.
- **Scalability**: Scales tests horizontally by adding more nodes to the grid.
- **Resource Optimization**: Efficiently utilizes hardware resources for faster test execution.
- **Cross-Platform Testing**: Supports testing on different operating systems and browsers simultaneously.

### Sauce Labs
- **Cloud-based Testing Platform**: Provides access to a wide range of browsers, devices, and operating systems.
- **Automated Testing**: Runs Selenium and Appium tests in the cloud.
- **Parallel Testing**: Executes tests in parallel for faster feedback.
- **Analytics and Reporting**: Offers detailed test reports and analytics for test results.

 ### Running Allure Reports With Selenium Framework
- **Test Reporting**: Integrates Allure Reports for comprehensive test reporting and visualization.
- **Rich Insights**: Provides detailed information on test execution, failures, and trends.

### Running Selenium Tests Using Jenkins Pipeline
- **Automation Pipelines**: Executes Selenium tests using Jenkins pipelines for continuous integration.
- **Configuration**: Configures Jenkins jobs to trigger Selenium test runs automatically.

### Integrating Jenkins With Slack
- **Notifications**: Integrates Jenkins with Slack to receive build and test notifications.
- **Real-Time Updates**: Sends alerts and status updates to Slack channels for team visibility and collaboration.
  

## Installation

To use this project, ensure you have Java and Maven installed. Clone the repository and install dependencies using Maven:

```bash
git clone https://github.com/mohammad-alaa-ma/seleniumFramework.git
cd your-repository
mvn install

