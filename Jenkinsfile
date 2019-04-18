 node{
   stage('SCM Checkout'){
     git 'https://github.com/aseefmulla/MavenJenkinPipe'
   }
   stage('Compile-Package'){
    
      def mvnHome =  tool name: 'maven-3.6.0', type: 'maven'   
      sh "${mvnHome}/bin/mvn package"
   }
}
