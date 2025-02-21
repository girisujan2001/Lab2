pipeline {
    agent any
    environment {
        MAVEN_HOME = tool 'Maven3'
    }
    stages {
        stage('Checkout') {
            steps {
                git credentialsId: 'github-pat', url: 'https://github.com/girisujan2001/Lab2.git', branch: 'main'
            }
        }
        /*
        stage('Initialize') {
            steps {
                script {
                    // REMOVE THIS STAGE: It's causing the error
                    bat 'mvn archetype:generate -DgroupId=com.example -DartifactId=COMP367_WebApp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false'
                }
            }
        }
        */
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Deploy') {
            steps {
                bat 'mvn jetty:run &'
            }
        }
    }
}
