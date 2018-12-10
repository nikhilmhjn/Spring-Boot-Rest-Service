node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/nikhilmhjn/Spring-Boot-Rest-Service.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
     // mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         //sh "'${MAVEN_HOME}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
        // bat(/"${MAVEN_HOME}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
         bat(/"${M2_HOME}\bin\mvn"  -Dmaven.test.failure.ignore clean package/)
      }
   }
   
    stage('Unit Test') {
      // Run the maven build
      if (isUnix()) {
            //Unit test cases
      } else {
         bat(/"${M2_HOME}\bin\mvn"  clean test/)
      }
   }

}
