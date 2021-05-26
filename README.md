# Getting started with Serenity and Cucumber

Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured.

Serenity strongly encourages good test automation design, and supports several design patterns, including classic Page Objects, the newer Lean Page Objects/ Action Classes approach, and the more sophisticated and flexible Screenplay pattern.

The latest version of Serenity supports Cucumber 5.5.

## The starter project
The best place to start with Serenity and Cucumber is to clone or download the starter project on Github ([https://github.com/serenity-bdd/serenity-cucumber-starter](https://github.com/serenity-bdd/serenity-cucumber-starter)). This project gives you a basic project setup, along with some sample tests and supporting classes. There are two versions to choose from. The master branch uses a more classic approach, using action classes and lightweight page objects, whereas the **[screenplay](https://github.com/serenity-bdd/serenity-cucumber-starter/tree/screenplay)** branch shows the same sample test implemented using Screenplay.

### The project directory structure
The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
     + search                  Feature file subdirectories 
             search_by_keyword.feature
```
