pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                script {
                    echo "Building app..."
                }
            }
        }
         stage('build') {
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
