pipeline {
    agent any
    tools {
        maven 'jenkins-maven'
        jdk 'jenkins-jdk'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn clean install' 
            }
        }
        
        stage ('Deploy'){
        	steps {
        		withCredentials([[$class			:'UsernamePasswordMultiBinding',
        						   credentialsId	:'PCF_LOGIN',
        						   usernameVariable	:'USERNAME',
        						   passwordVariable	:'PASSWORD'
        		]]){
        			sh '/usr/local/bin/cf login -a https://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
        			sh '/usr/local/bin/cf push'
        		}
        	}
        }
    }
}