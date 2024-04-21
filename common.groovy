common.groovy
def call(string stageName){
	if ("${stageName}" == "Build")
	   {
		sh "mvn clean package"
	   }
	else if ("${stageName}" == "SonarQube Report")
	   {
        sh "mvn clean sonar:sonar"
	   }
	else if ("${stageName}" == "upload into Nexus")
	   {
	    sh "mvn clean deploy"
	   } 
}


