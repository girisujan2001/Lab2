pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    git credentialsId: 'github-pat', url: 'https://github.com/girisujan2001/COMP367_WebApp.git'
                }
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Deploy') {
            steps {
                sh 'mvn jetty:run &'
            }
        }
    }
}
