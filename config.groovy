#!/usr/bin/env groovy

def setEnvFromCredential(credentialId) {
  withCredentials([string(credentialsId: credentialId, variable: 'ENV')]) {
    sh "echo '$ENV' > .env" 
  }
}

return this
