node{
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '25b82dd0-c1b2-4e6b-9a25-a445cdf81d6b', url: 'https://github.com/Khaykin/Project']]])
  bat 'pwd'
  bat 'echo'
  junit '**/build/test-reports/*.xml'
  mail bcc: '', body: 'test', cc: '', from: '', replyTo: '', subject: 'test', to: 'igor.khaykin@arm.com'
  }
