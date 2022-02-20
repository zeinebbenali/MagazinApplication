pipeline {
    agent any
    stages {
         stage('clean') {
            steps {
                bat "mvn clean -f MagazinApplication"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f MagazinApplication"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f MagazinApplication"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f MagazinApplication"
            }
        }
    }
}