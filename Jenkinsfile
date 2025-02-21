pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    git credentialsId: '515f5f6d-2653-4d08-b08e-21879a1bc25e', url: 'https://github.com/girisujan2001/Lab2/blob/main/Jenkinsfile'
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
