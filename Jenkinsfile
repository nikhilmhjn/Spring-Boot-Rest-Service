pipeline {
    agent any
    stages {
        stage('Code Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '3e93a85d-625d-43db-b3aa-a387db1310ed', url: 'https://github.com/nikhilmhjn/Spring-Boot-Rest-Service.git']]])
            }
        }
    }
}
