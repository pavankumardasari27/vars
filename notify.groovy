#!/usr/bin/env groovy

def buildResult(email) {
  emailext subject: "[${currentBuild.currentResult}] ${env.JOB_NAME}",
           body: "${currentBuild.currentResult} - ${env.BUILD_URL}",
           to: email
}

return this
