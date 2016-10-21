node{
  pwd()
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '25b82dd0-c1b2-4e6b-9a25-a445cdf81d6b', url: 'https://github.com/Khaykin/Project']]])
  bat 'pwd'
  bat 'echo'
  junit allowEmptyResults: true, healthScaleFactor: <object of type java.lang.Double>, testDataPublishers: [[$class: 'AttachmentPublisher']], testResults: 'report'
  mail bcc: '', body: 'test', cc: '', from: '', replyTo: '', subject: 'test', to: 'igor.khaykin@arm.com'
  }
