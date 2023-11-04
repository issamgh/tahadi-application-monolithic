pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
				echo 'Checking out the code from the Git repository'
                script {
                    git branch: 'main', url: 'https://github.com/digiwiseTech/tahadi-application-monolithic.git'
                }
            }
        }
        
        stage('Build') {
            steps {
				 echo 'Building the code'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application'
            }
        }
    }
}
