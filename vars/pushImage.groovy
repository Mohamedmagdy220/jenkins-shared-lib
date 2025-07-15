def call() {
    def image = "${env.IMAGE_NAME}:${env.IMAGE_TAG}"
    echo "📤 Pushing Docker image: ${image}"
    withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
    sh 'echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin'
    sh "docker push ${image}"
    }
}
