def call() {
    def image = "${env.IMAGE_NAME}:${env.IMAGE_TAG}"
    echo "🧹 Removing local Docker image: ${image}"
    sh "docker rmi ${image} || true"
}
