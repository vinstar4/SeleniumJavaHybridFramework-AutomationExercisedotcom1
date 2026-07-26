# Java Selenium Automation Framework

A Hybrid Selenium Automation Framework built using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven** for automating the test cases available on **Automation Exercise**.

This framework is extended from:

> https://github.com/vinstar4/JavaSeleniumHybridFramework

The project follows the **Page Object Model (POM)** design pattern and aims to provide a clean, maintainable, and scalable automation framework.

For the framework architecture, project structure, and design philosophy, please refer to the original repository linked above.

---

# Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* Apache POI
* Extent Reports
* Git & GitHub

---

# Features

* Page Object Model (POM)
* Reusable BasePage methods
* Explicit Waits
* Extent Reporting
* TestNG Execution
* Maven Build Support
* Configurable Browser Execution
* Utility Classes
* Screenshot Support

---

# Test Cases Implemented

* **Test Case 1:** Register User
* **Test Case 2:** Login User with Correct Credentials
* **Test Case 3:** Login User with Incorrect Credentials
* **Test Case 4:** Logout User
* **Test Case 5:** Register User with Existing Email
* **Test Case 6:** Contact Us Form
* **Test Case 7:** Verify Test Cases Page
* **Test Case 8:** Verify All Products and Product Detail Page
* **Test Case 9:** Search Product
* **Test Case 10:** Verify Subscription in Home Page
* **Test Case 11:** Verify Subscription in Cart Page
* **Test Case 12:** Add Products in Cart

---

# Running the Project

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to the project directory:

```bash
cd <project-folder>
```

Execute the tests:

```bash
mvn clean test
```

---

# Test Execution

The project includes a **testng.xml** suite.

By default:

* `pom.xml` is configured to execute the bundled `testng.xml`.
* The current suite executes the **User Registration** and **Account Deletion** test flow.

You are free to:

* Modify `testng.xml` to execute any desired test classes.
* Create additional TestNG suites.
* Configure the Maven Surefire Plugin as per your project requirements.

Example:

```bash
mvn clean test
```

---

# Future Enhancements

* Complete the remaining Automation Exercise test cases
* Cross-browser execution
* Parallel execution
* Data-driven testing
* Jenkins CI integration
* Docker support
* GitHub Actions CI
* Retry Analyzer
* Browser parameterization
* Headless execution

---

# Acknowledgements

* https://automationexercise.com
* https://github.com/vinstar4/JavaSeleniumHybridFramework
* Selenium WebDriver
* TestNG
* Apache Maven
