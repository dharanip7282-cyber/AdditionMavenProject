pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Checkout GitHub') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/YOUR-USERNAME/AdditionMavenProject.git'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Addition Maven project built and tested successfully.'
        }
        failure {
            echo 'Build failed. Check the Console Output for details.'
        }
    }
}
