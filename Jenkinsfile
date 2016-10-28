node{
  pwd()
  bat 'rm -f -r -d *'
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '25b82dd0-c1b2-4e6b-9a25-a445cdf81d6b', url: 'https://github.com/Khaykin/Project']]])
  bat 'dir'
  //bat 'mkdir Test'
  //bat 'mv -v reports.xml Test'
  //bat 'dir Test'
  echo 'чего хочешь старче?'
  bat 'echo'
  //bat 'python jenkins_hdcp_junit_log_converter.py'
  //findFiles glob: 'def files = findFiles(glob: \'**/TEST-*.xml\') echo """${files[0].name} ${files[0].path} ${files[0].directory} ${files[0].length} ${files[0].lastModified}"""'
  //fileExists '**.xml'
  junit allowEmptyResults: true, keepLongStdio: true, testResults: '**.xml'
  mail bcc: '', body: 'More info about a build found here: ${env.BUILD_URL}', cc: '', from: '', replyTo: '', subject: "Job '${env.JOB_NAME}' (${env.BUILD_NUMBER}) status ${currentBuild.result}", to: 'igor.khaykin@arm.com'
  }
