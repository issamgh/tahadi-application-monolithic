pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
				echo 'Checking out the code from the Git repository'
                script {
                    git branch: 'main', url: 'https://github.com/issamgh/tahadi-application-monolithic.git'
                }
            }
        }
        
        stage('Maven Build') {
            steps {
				 echo 'Building the code with Maven'
				 //sh './mvnw clean install'
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
