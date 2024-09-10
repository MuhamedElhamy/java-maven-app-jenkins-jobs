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
                    sh 'mvn package'
                }
            }
        }
         stage('build image') {
            steps {
                script {
                    echo "Building the docker image..."
                    withCredentials([usernamePassword(credentialsID: 'dockerhub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh 'docker build -t mhmdelhamy/java-maven-app:2.0 .'
                        sh 'docker login -u $USER -p $PASS'
                        sh 'docker push mhmdelhamy/java-maven-app:2.0'
                    }
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
