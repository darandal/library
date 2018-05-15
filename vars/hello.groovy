#!groovy
def call() {
  sh 'echo Hello World'
  
  def varHere = "Something else"
  echo "${varHere}"
}
