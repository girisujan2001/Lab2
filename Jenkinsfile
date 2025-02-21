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
        sh 'mvn clean package'
    }
}
stage('Deploy') {
    steps {
        sh 'mvn jetty:run &'
    }
}
