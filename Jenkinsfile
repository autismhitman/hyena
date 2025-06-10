pipeline{
    
     agent any
     
     stages{
         
        stage('Build jar'){
            
          
         
          steps {
              bat "mvn clean package -DskipTests"
             
          }
         
        }
        
        stage('Build Image'){
         
          steps {
             
           
             bat "docker build -t=neopane2/selenium:latest ."
          }
         
        }
        
        stage('Push Image'){
          
          environment {
              DOCKER_HUB =credentials('dockerhub-creds')
          }
          
          steps {
             
             bat  "docker login -u ${DOCKER_HUB_USR} -p ${DOCKER_HUB_PSW}"
             bat "docker push neopane2/selenium:latest"
             bat "docker tag neopane2/selenium:latest neopane2/selenium:${env.BUILD_NUMBER}"
             bat "docker push neopane2/selenium:${env.BUILD_NUMBER}"
          }
         
        }
     }
     
     post{
         always{
             
             bat "docker logout"
         }
     }
     
     
}
