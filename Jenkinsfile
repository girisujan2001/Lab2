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
        stage('Initialize') {
            steps {
                script {
                    // Create the Maven project structure (Windows Batch)
                    bat '''
                    mvn archetype:generate -DgroupId=com.example -DartifactId=COMP367_WebApp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
                    '''
                }
            }
        }
        stage('Modify Code') {
            steps {
                script {
                    // Modify the Main.java file (Windows Batch)
                    bat '''
                    echo package com.example; > COMP367_WebApp\\src\\main\\java\\com\\example\\App.java
                    echo public class App { >> COMP367_WebApp\\src\\main\\java\\com\\example\\App.java
                    echo     public static void main(String[] args) { >> COMP367_WebApp\\src\\main\\java\\com\\example\\App.java
                    echo         System.out.println("Welcome to COMP367"); >> COMP367_WebApp\\src\\main\\java\\com\\example\\App.java
                    echo     } >> COMP367_WebApp\\src\\main\\java\\com\\example\\App.java
                    echo } >> COMP367_WebApp\\src\\main\\java\\com\\example\\App.java
                    '''
                }
            }
        }
        stage('Verify pom.xml') {
            steps {
                script {
                    // Verify pom.xml exists (Windows Batch)
                    bat 'dir COMP367_WebApp\\pom.xml'
                }
            }
        }
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
