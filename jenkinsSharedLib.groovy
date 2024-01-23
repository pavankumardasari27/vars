#!/usr/bin/env groovy

class SshUtils {
  
  def sshToServer(ip, key) {
    sh "ssh -o StrictHostKeyChecking=no -i ${key} ubuntu@${ip}" 
  }
  
  def sshRemoveServer(ip) {
    sh "ssh -o StrictHostKeyChecking=no -i ${key} ubuntu@${ip} 'exit'"
  }
  
}

class FileUtils {

  def copyFile(source, destination) {
    sh "cp ${source} ${destination}"
  }

}

class ComposerUtils {

  def composerInstall() {
    sh 'composer install'
  }

  def composerUpdate() {
    sh 'composer update' 
  }

}

class Certbot {

  def getCert(email, domain) {
    sh "certbot certonly --nginx --email ${email} --agree-tos -d ${domain}"
  }

}

return this
