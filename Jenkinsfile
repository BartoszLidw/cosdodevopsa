pipeline {
    agent any
environment {
		DOCKERHUB_CREDENTIALS=credentials('dockerhub')
	}
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
	            sh 'ls'
		    sh 'ls app -a'
                       image_Build.run("-v \$(pwd)/shared_volume:/output")
			sh 'ls app -a'
		    sh 'ls shared_volume -a'
		    }
                
            }
        }
        stage('Test') {
            steps {
               
                    script {
			 
			    sh 'ls app ' 
			    sh 'ls'
                    def image_Build = docker.build("cos_test", ". -f Dockerfile_Test")
                    sh 'echo tested'
                }
                
            }
        }
        stage('Deploy') {
            steps {
               
                  script {
		     
                    sh 'docker rm -f cos_depy'
		    sh 'ls shared_volume' 
		
		    sh 'ls app'  
                    def deploy_Image = docker.build("cos_depy", ". -f Dockerfile_Deploy")
                    deploy_Image.run("--name cos_depy")
                    sh 'sleep 10'
                    sh 'docker rm -f cos_depy'
                }
                
                
            }
        }
		stage('Publish'){
		    steps {

		    sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
		    sh 'docker push cosdodevopsa:${env.BUILD_ID}'
			}
    		}
	}
    }	    
    post {
        success {
            echo 'Succeeded, now I`m saving artifact.'
            archiveArtifacts artifacts: 'shared_volume/app.jar', fingerprint: true
        }
        failure {
            echo 'Failed, I`m not saving any artifacts.'
        }
    }
}

