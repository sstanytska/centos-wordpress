



pipeline{
    parameters{
      string(defaultValue: '5.0.4', description: 'Please provide version of the wordpress.', name: 'wordpressVersion', trim: true)
    }
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
