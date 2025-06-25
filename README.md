# REST API Test Automation Framework

A robust and scalable API test automation framework built with RestAssured, Cucumber, and JUnit 5. This framework follows industry best practices for API testing and serves as a showcase of modern test automation skills.

## 🚀 Key Features

- **BDD Approach**: Utilizes Cucumber for behavior-driven development with Gherkin syntax
- **REST API Testing**: Powered by RestAssured for comprehensive API testing
- **Multi-Format Reporting**: Generates HTML, JSON, and JUnit XML reports
- **CI/CD Ready**: Easily integrable with any CI/CD pipeline
- **Page Object Model**: Well-structured test architecture for maintainability
- **Logging**: Built-in logging with SLF4J
- **Dependency Management**: Managed by Gradle for easy dependency resolution

## 🛠️ Tech Stack

- **Language**: Java 11+
- **Testing Framework**: JUnit 5
- **API Testing**: RestAssured 5.3.0
- **BDD**: Cucumber 7.11.0
- **Build Tool**: Gradle
- **Reporting**: Built-in Cucumber reporting + Custom HTML reports

## 📁 Project Structure

```
├── src/test/
│   ├── java/
│   │   ├── runners/            # Test runners
│   │   ├── steps/             # Step definitions
│   │   └── listeners/         # Test listeners
│   └── resources/
│       └── features/         # Feature files
└── build/reports/             # Test reports
```

## 🚀 Getting Started

### Prerequisites

- Java JDK 11 or higher
- Gradle 7.0 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd RestAssurredCucmber
   ```

2. Build the project:
   ```bash
   ./gradlew clean build
   ```

### Running Tests

Run all tests:
```bash
./gradlew test
```

Generate HTML report:
```bash
./gradlew generateCucumberReport
```

## 📊 Test Reports

After test execution, reports can be found in:
- HTML Report: `build/reports/cucumber/cucumber.html`
- JUnit Report: `build/reports/cucumber/cucumber.xml`
- JSON Report: `build/reports/cucumber/cucumber.json`

## 🧪 Example Test Scenario

```gherkin
Feature: User API Testing
  As a user
  I want to verify the user API endpoint
  So that I can ensure it returns the correct response

  Scenario: Verify successful response from users API
    When I send a GET request to "https://reqres.in/api/users?page=2"
    Then the response status code should be 200
```

## 🏗️ Design Patterns

- **Page Object Model**: For better test maintenance and reusability
- **Step Definitions**: Separated from test logic for better organization
- **Hooks**: For setup and teardown operations
- **Configuration Management**: Environment-specific configurations

## 🧰 Skills Demonstrated

- REST API testing with RestAssured
- BDD with Cucumber
- Test automation best practices
- Build automation with Gradle
- Continuous Integration/Deployment
- Version control with Git
- Clean code principles
- Test reporting and analysis

## 🤝 Contributing

Feel free to submit issues and enhancement requests. Contributions are welcome!


## 📬 Contact

- 📧 Email: [sangamnath.professional@gmail.com](mailto:sangamnath.professional@gmail.com)
- 💼 LinkedIn: [Sangamnath Ingalalli](https://www.linkedin.com/in/sangamnath-ingalalli/)
- 💻 GitHub: [SangamnathIngalalli](https://github.com/SangamnathIngalalli)