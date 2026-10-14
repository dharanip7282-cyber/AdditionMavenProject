# Addition Maven Project

A simple Java Maven project that adds two numbers, tests the result with JUnit 4, and can be built by Jenkins.

## Requirements

- JDK 17 or later
- Apache Maven 3.9+
- Git
- Jenkins with a Maven tool installation named `M3`

## Project structure

```text
AdditionMavenProject/
├── pom.xml
├── Jenkinsfile
├── README.md
├── .gitignore
└── src/
    ├── main/java/com/example/Addition.java
    └── test/java/com/example/AdditionTest.java
```

## Run locally in VS Code

Open a terminal in the project folder and run:

```bash
mvn clean test
mvn package
java -cp target/classes com.example.Addition
```

Expected program output includes:

```text
First number: 10
Second number: 20
Sum: 30
```

The tests should report 3 tests, 0 failures, and `BUILD SUCCESS`.

## GitHub

Create a GitHub repository named `AdditionMavenProject`, upload these project files and folders to the repository root, and ensure the branch is named `main`.

## Jenkins

The included `Jenkinsfile` assumes the Maven installation in Jenkins is named `M3`. Before running the pipeline, replace `YOUR-USERNAME` in the GitHub URL with your GitHub username.

If using **Pipeline script** directly in Jenkins, paste the Jenkinsfile contents into the Script box after updating the URL. If using **Pipeline script from SCM**, choose Git, enter the repository URL, branch `*/main`, and script path `Jenkinsfile`.
