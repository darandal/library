#!groovy
def call() {
  sh 'echo Hello World'
  
  def results = sh(script:"echo ${options}", returnStdout:true).trim()
  echo "${results}"
  def varHere = "Something else"
  echo "${varHere}"
}
