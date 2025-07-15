def call() {
    def image = "${env.IMAGE_NAME}:${env.IMAGE_TAG}"
    echo "🔍 Scanning Docker image: ${image}"
    sh "trivy image ${image} || true"
}
