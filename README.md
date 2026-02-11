This is a Hybrid Test Automation Framework built using the Page Object Model (POM) and Data-Driven Testing approach.
The framework is designed for scalability, maintainability, and cross-browser execution with support for parallel execution, cloud testing, CI/CD integration, and code quality checks.

Code quality is maintained using SonarQube for static code analysis.

Framework Components

1️⃣ **Utility Package** (com.utility)

Contains reusable utility classes:

BrowserUtility – Handles browser initialization and configuration.

ExcelReaderUtility – Reads test data from Excel files.

PropertyFileReaderUtility – Reads configuration from .properties files.

ExtentReport Utility – Generates rich HTML execution reports.

2️⃣ **Pages Package** (com.pages)

Contains all Page Object classes.

Each page includes:

Web element locators

Page actions (business logic methods)

This ensures separation of test logic from page implementation.

3️⃣ **TestBase Class**

Contains @BeforeMethod and @AfterMethod.

Responsible for:

Browser setup

Test initialization

Cleanup after execution

4️⃣ **Listener Package** (com.listener)

Implements ITestListener.

Captures:

Test start

Test success

Test failure

Test skip

Logs execution details into Extent Report after each test cycle.

5️⃣ **POJO Classes**

Used for mapping structured test data.

Helps in clean and maintainable data handling.

6️⃣ **DataProvider Package (com.dataprovider)**

Contains TestNG @DataProvider methods.

Supports login test data execution.

Enables data-driven testing.

7️⃣ **Test Data**

Stores username and password.

Can be maintained in:

Excel

External files

8️⃣ **Environment Configuration**

Environment details are stored in .properties files:

Dev.properties

QA.properties

Used to manage environment-specific:

URLs

Configurations

9️⃣ **Constants Package** (com.constants)

Contains Enums.

Stores browser-related constant values.

Improves maintainability and avoids hardcoding.

⚙️ Advanced Features

✅ **Parallel Execution**

Configured in testng.xml

Uses:

parallel attribute

thread-count attribute

Enables faster execution.

✅ **TestNG Parameters**

Parameters defined in testng.xml

Passed to test methods using @Parameters

Supports dynamic test execution.

✅ **Maven Integration**

Configured Maven Surefire Plugin in pom.xml

Tests can be executed using:

mvn test

✅ **System Property Configuration**

Supports dynamic execution using command line parameters:

mvn test -Dbrowser=chrome -Denv=QA

✅ **Cross Browser Testing**

Supports execution on:

Chrome

Firefox

Edge

Using browser enum configuration.

✅  **Cloud Testing Integration**

Integrated with LambdaTest for cloud-based cross-browser execution.

✅  **CI/CD Integration**

Framework uploaded to GitHub.

Configured GitHub Actions for automated execution.

✅ **Automation Scheduling**

Automated test execution using Cron Job scheduling.

Enables periodic unattended test runs.

📊 **Reporting**

Integrated Extent Reports

Provides:

Step-level logs

Screenshots on failure

Test execution summary

Interactive HTML reports

🔎 **Code Quality**

Integrated with SonarQube

Ensures:

Code quality checks

Bug detection

Code smells identification

Maintainability improvements

 **Design Pattern Used**

Hybrid Framework

Page Object Model (POM)

Data-Driven Testing

Enum-based configuration
