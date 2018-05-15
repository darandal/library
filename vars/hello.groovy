#!groovy
def call() {
  sh 'echo Hello World'
  
  //def results = sh(script:"echo ${options}", returnStdout:true).trim()
  //echo "${results}"
  def varHere = "Something else"
  echo "${varHere}"
  
  //place in init.groovy
  //sh "env > ${env.LOG_PATH}/env.log"
  //archiveArtifacts(artifacts: "${env.LOG_PATH}/env.log", allowEmptyArchive: true)
}
