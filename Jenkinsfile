pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    def gitUrl = 'https://github.com/Medelouali/DevOpsTest.git'
                    def gitBranch = 'main'
                    checkout([$class: 'GitSCM', branches: [[name: gitBranch]], userRemoteConfigs: [[url: gitUrl]])
                }
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package' // Replace with your build command.
            }
        }

        stage('Unit Tests') {
            steps {
                sh 'mvn test' // Replace with your test command.
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    def imageName = 'medelouali/clients-list-image'
                    def imageTag = 'latest' // You can use a different tag if needed

                    // Build the Docker image
                    sh "sudo docker build -t $imageName:$imageTag ."

                    // Push the Docker image to Docker Hub
                    sh "sudo docker push $imageName:$imageTag"
                }
            }
        }
    }
}
