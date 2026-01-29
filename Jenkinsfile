pipeline {
  agent any

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Test') {
      steps {
        bat 'mvn -B -ntp test'
      }
    }

    stage('Package') {
      steps {
        bat 'mvn -B -ntp package'
      }
    }
  }

  post {
    always {
      // If you have Surefire tests, this will publish results in Jenkins.
      junit 'target/surefire-reports/*.xml'
      archiveArtifacts artifacts: 'target/*.jar', fingerprint: true, allowEmptyArchive: true
    }
  }
}