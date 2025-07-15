def call() {
    def image = "${env.IMAGE_NAME}:${env.IMAGE_TAG}"
    echo "📤 Pushing Docker image: ${image}"
    sh "docker push ${image}"
}
