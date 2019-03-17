pipeline{
    agent any
    stages{
        stage("run packer"){
            sh "packer build image.json"
        }
    }
}