pipeline {
    agent any
    stages {
         stage('clean') {
            steps {
                bat "mvn clean -f Magazin-Application"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f Magazin-Application"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f Magazin-Application"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f Magazin-Application"
            }
        }
    }
}