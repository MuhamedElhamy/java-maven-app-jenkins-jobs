pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage('build jar') {
            steps {
                script {
                    echo "Building app..."
                }
            }
        }
         stage('build image') {
            steps {
                script {
                    echo "Testing the application..."
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                   echo "Deploying app..."
                }
            }
        }
    }
}
