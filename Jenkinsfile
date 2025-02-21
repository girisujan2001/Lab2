pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    git credentialsId: 'github-pat', url: 'https://github.com/girisujan2001/Lab2.git', branch: 'main'
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
                bat 'mvn jetty:run'
            }
        }
    }
}
