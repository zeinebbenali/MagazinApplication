pipeline {
  agent {
    label 'docker'
  }
  environment {
    imageId = 'zeinebbenali/magazin-application:1.$BUILD_NUMBER'
    docker_registry = 'zeinebbenali'
    docker_creds = credentials('ZAza+1990')
  }
  stages {
    stage('Docker build') {
      steps {
        sh "docker build --no-cache --force-rm -t ${imageId} ."
      }
    }
    stage('Docker push') {
      steps {
        sh'''
          docker login $docker_registry --username $docker_creds_USR --password $docker_creds_PSW
          docker push $imageId
          docker logout
        '''
      }
    }
    stage('Clean') {
      steps{
        sh "docker rmi ${imageId}"
      }
    }
  }
}



pipeline {
    agent any
    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'apache-maven-3.3.9') {
                    bat 'mvn clean compile'
                }
            }
        }
              stage("build & SonarQube analysis") {
                  steps {
                      withSonarQubeEnv('My SonarQube Server') {
                         sh 'mvn clean package sonar:sonar'
                      }
                  }
              }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'apache-maven-3.3.9') {
                    bat 'mvn test'
                }
            }
        }
        stage ('Install Stage') {
            steps {
                withMaven(maven : 'apache-maven-3.3.9') {
                    bat 'mvn install'
                }
            }
        }
    }
}