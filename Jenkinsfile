pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Compile') {
            steps {
                sh 'javac Calculator.java'
            }
        }
        stage('Test/Run') {
            steps {
                // Testing a simple addition
                sh 'java Calculator 10 + 5'
            }
        }
    }
    post {
        success {
            archiveArtifacts artifacts: '*.class', fingerprint: true
        }
    }
}
