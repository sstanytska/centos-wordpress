
//
properties([parameters([string(defaultValue: '5.0.4', description: 'Please provide version of the wordpress.', name: 'wordpressVersion', trim: true)]),

pipeline{
    agent any
    stages {
        //
        stage('set version') {
          sh "export WORDPRESS_VERSION=${wordpressVersion}"
        }
        //
        stage("run packer"){
          steps{
                sh "packer build image.json"
          }
        }
    }
}
