node{
  pwd()
  bat 'rm -f -r -d *'
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '25b82dd0-c1b2-4e6b-9a25-a445cdf81d6b', url: 'https://github.com/Khaykin/Project']]])
  bat 'dir'
  bat 'mkdir Test'
  bat 'mv -v reports.xml Test'
  bat 'dir Test'
  bat 'echo'
  findFiles glob: 'def files = findFiles(glob: \'**/TEST-*.xml\') echo """${files[0].name} ${files[0].path} ${files[0].directory} ${files[0].length} ${files[0].lastModified}"""'
  fileExists '**.xml'
  junit allowEmptyResults: true, keepLongStdio: true, testResults: ' **/*.xml'
  mail bcc: '', body: 'test', cc: '', from: '', replyTo: '', subject: 'test', to: 'igor.khaykin@arm.com'
  }
