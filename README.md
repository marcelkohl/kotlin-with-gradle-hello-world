[![Maintenance](https://img.shields.io/badge/Version-alpha_test-purple.svg)](https://GitHub.com/Naereen/StrapDown.js/graphs/commit-activity)
[![GPLv3 license](https://img.shields.io/badge/License-GPLv3-blue.svg)](http://perso.crans.org/besson/LICENSE.html)
[![Ask Me Anything !](https://img.shields.io/badge/Ask%20me-anything-1abc9c.svg)](https://GitHub.com/Naereen/ama)

# Kotlin with gradle
This repository is the attempt to run Kotlin code using gradle.

**PS:** Everything was done running on a Linux Ubuntu environment and may have differences among other OSs.

## Insights
Things to not forget when setting-up
- Kotlin libs, java and gradle may conflict if the versions are not properly aligned;
- JDK must be from Oracle instead of openJDK and some common libs are not the same on openJDK;
- Java from Oracle cannot be installed from the repository anymore, instead, download the deb file directly from your Oracle account;
- Java multiple versions could conflict, use `update-alternatives --config java`

## Setup
Ideal setup for this project is:
- Java Oracle (JDK 11.0.10)
- Gradle (to create the initial wrapper)

## Running code
### Generate graddle wrapper
`gradle wrapper --gradle-version 5.1.1`
### Running
```
./gradlew run

> Task :run
Hello World

BUILD SUCCESSFUL in 1s
2 actionable tasks: 2 executed
```
