pipeline {
    agent any
    stages {
         stage('clean') {
            steps {
                bat "mvn clean "
            }
        }
      stage('compile') {
                 steps {
                     bat "mvn compile "
                 }
             }
        stage('test') {
            steps {
                bat "mvn test"
            }
        }
         stage('install') {
                    steps {
                        bat "mvn install "
                    }
                }
        stage('package') {
            steps {
                bat "mvn package "
            }
        }
    }
}