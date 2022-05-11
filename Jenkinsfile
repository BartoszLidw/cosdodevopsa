pipeline {
    agent any

    stages {
        stage("Dependencies") {
            steps {
                script{
		docker.build("cos_dep", ". -f Dockerfile_Dependecny")
                    
                    sh 'echo dependencies'
		}
            }
        }
        
        stage('Build') {
            steps {
		    script{
               docker.build("cos_bui", ". -f Dockerfile_Build")
                    sh 'echo builded'
		    }
                
            }
        }
        stage('Test') {
            steps {
               
                    script {
                    docker.build("cos_test", ". -f Dockerfile_Test")
                    sh 'echo tested'
                }
                
            }
        }
        stage('Deploy') {
            steps {
               
                   sh 'echo dependencies'
                
                
            }
        }
    }
   
}
