node{
  stage 'clean workspace'
  pwd()
  bat 'rm -f -r -d *'
  stage 'checkout'
  //checkout([$class: 'GitSCM', branches: [[name: '*/*']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '25b82dd0-c1b2-4e6b-9a25-a445cdf81d6b', url: 'https://github.com/Khaykin/Project']]])
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'CheckoutOption', timeout: 10], [$class: 'CleanBeforeCheckout']], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'aab11f73-8ab1-4968-86e1-66fd01c54d9d', url: 'https://github.com/Khaykin/Project']]])

  bat 'dir'
  //bat 'mkdir Test'
  //bat 'mv -v reports.xml Test'
  //bat 'dir Test'
  stage 'cheking'
  bat 'git tag'
  echo 'wo za gavno?'
  bat 'echo'
  bat 'pwd'
  //findFiles glob: 'def files = findFiles(glob: \'**/TEST-*.xml\') echo """${files[0].name} ${files[0].path} ${files[0].directory} ${files[0].length} ${files[0].lastModified}"""'
  //fileExists '**.xml'
  stage 'collecting of results'
  bat 'dir'
  bat 'python jenkins_hdcp_junit_log_converter.py {} ;'
  junit allowEmptyResults: true, keepLongStdio: true, testResults: '**.xml'
  //mail bcc: '', body: 'More info about a build found here: '${env.BUILD_URL}', cc: '', from: '', replyTo: '', subject: "Job '${env.JOB_NAME}' (${env.BUILD_NUMBER}) status ${currentBuild.result}", to: ('igor.khaykin@arm.com')
  //mail bcc: '', body: '\'More info about a build found here: \'${env.BUILD_URL}', cc: '', from: '', replyTo: '', subject: 'Job \'${env.JOB_NAME}\' (${env.BUILD_NUMBER}) status ${currentBuild.result}', to: 'igor.khaykin@arm.com'
  stage 'Send e-mail' 
             mail (to: 'igor.khaykin@arm.com', cc: '',
        subject: "Job ${env.JOB_NAME} #${env.BUILD_NUMBER} status ${currentBuild.result}", 
		   body: "More info about a build #${env.BUILD_NUMBER} commiter ${env.CHANGE_AUTHOR_EMAIL} found here: ${env.BUILD_URL}", 
            mimeType:'text/html')
  }
