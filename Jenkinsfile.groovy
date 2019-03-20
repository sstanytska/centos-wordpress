
pipeline {

    agent any

    parameters {
      string( defaultValue: '5.0.4', description: 'Please provide version of the wordpress.', name: 'wordpressVersion', trim: true)
    }

    stages {

        stage("set version") {
          steps {
            sh "export WORDPRESS_VERSION=${wordpressVersion}"
          }
        }

        stage("run packer"){
          steps{
                sh "packer build image.json"
          }
        }
    }
}
