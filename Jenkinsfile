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
		    script
		    {
			sh 'ls'    
		    def image_Build = docker.build("cos_bui", ". -f Dockerfile_Build")
                    sh 'rm -rf shared_volume'
                    sh 'mkdir shared_volume'
                    image_Build.run("-v \$(pwd)/shared_volume:/out")
			    sh'ls shared_volume'
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
               
                  script {
                    sh 'docker rm -f cos_dep'
                    def deploy_Image = docker.build("cos_dep", ". -f Dockerfile_Deploy")
                    deploy_Image.run("--name cos_dep")
                    sh 'sleep 10'
                    sh 'docker rm -f cos_dep'
                }
                
                
            }
        }
    }
   
}
