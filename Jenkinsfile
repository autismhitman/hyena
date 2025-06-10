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
             
             bat "docker build -t=neopane2/selenium ."
          }
         
        }
        
        stage('Push Image'){
         
          steps {
             
             bat "docker push neopane2/selenium"
          }
         
        }
     }
     
     
}
