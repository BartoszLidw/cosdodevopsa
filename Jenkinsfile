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
			    
		    sh 'rm -rf shared_volume'    
		    def image_Build = docker.build("cos_bui", ". -f Dockerfile_Build")
            
                    sh 'mkdir shared_volume'
		    sh 'ls app/target'
                    image_Build.run("-v \$(pwd)/shared_volume:/output")
		    sh 'ls shared_volume'
		    }
                
            }
        }
        stage('Test') {
            steps {
               
                    script {
			 
			    sh 'ls app' 
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
		
		    sh 'ls'  
                    def deploy_Image = docker.build("cos_depy", ". -f Dockerfile_Deploy")
                    deploy_Image.run("--name cos_depy")
                    sh 'sleep 10'
                    sh 'docker rm -f cos_depy'
                }
                
                
            }
        }
		stage('Publish'){
		    steps {

		withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'dockerhubPassword', usernameVariable: 'dockerhubUser')]) {
		    sh "docker login -u ${dockerhubUser} -p ${dockerhubPassword}"
		    sh "docker push cosdodevopsa:${env.BUILD_ID}"
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

