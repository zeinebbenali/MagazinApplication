pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
               bat "rmdir  /s /q MagazinApplication"
                bat "git clone https://github.com/zeinebbenali/MagazinApplication.git"
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