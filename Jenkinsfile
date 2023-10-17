pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    def gitUrl = 'https://github.com/Medelouali/DevOpsTest.git'
                    def gitBranch = 'main'
                    checkout([$class: 'GitSCM', branches: [[name: gitBranch]], userRemoteConfigs: [[url: gitUrl]]])
                }
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package' // Replace with your build command..
            }
        }

        stage('Unit Tests') {
            steps {
                sh 'mvn test' // Replace with your test command.
            }
        }
    }
}
