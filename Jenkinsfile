pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the Git repository.
                script {
                    def gitUrl = 'https://github.com/Medelouali/DevOpsTest.git'
                    def gitBranch = 'main' // Use your desired branch.
                    checkout([$class: 'GitSCM', branches: [[name: gitBranch]], userRemoteConfigs: [[url: gitUrl]]])
                }
            }
        }
    }
}