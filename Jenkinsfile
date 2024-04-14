	agent: any

	environment {
  		email = "mishraskus637@gmail.com"
	}

	parameters {
  		choice choices: ['chrome', 'firefox', 'edge'], description: 'Please select a browser', name: 'Browser'
	}
	
	stages{
		stage('Build') {
		  steps {
		    sh"""
		    	mvn build 
		     """
		  }
		}
		
		stage('Run'){
			steps{
				sh """
				mvn test -d"{$param.Browser}"
				"""	
			}
		}
	}