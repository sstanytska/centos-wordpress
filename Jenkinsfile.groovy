pipeline{
    agent any
    stages{
        stage("run packer"){
          steps{
                sh "packer build image.json -var-file=versions"
          }
        }
    }
}