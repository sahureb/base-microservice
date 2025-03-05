#!/bin/groovy

pipeline {
    agent any
    options { timestamps () }
    tools { 
        maven 'Maven 3.9.9' 
    }
    stages {
        stage('Build') {
            steps {
                sh 'java --version'
                echo '===================================================================='
                sh 'mvn clean install'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE'){
                echo 'Testing..'
                sh 'timeout 10 java -Dserver.port=8888 -jar /var/jenkins_home/.m2/repository/com/cs/base-microservice/0.0.1-SNAPSHOT/base-microservice-0.0.1-SNAPSHOT.jar'
                }
            }
        }
        stage('Build image') {         
            steps {
                script {
                    dockerImage = docker.build("k8s-base-microservice:${env.BUILD_NUMBER}")
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}