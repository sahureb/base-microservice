#!/bin/groovy

pipeline {
    agent any
    tools { 
        maven 'Maven 3.8.5' 
    }
    stages {
        stage('Build') {
            steps {
                mvn clean install
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}