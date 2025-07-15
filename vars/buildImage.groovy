def call() {
    def image = "${env.IMAGE_NAME}:${env.IMAGE_TAG}"
    echo "🐳 Building Docker image: ${image}"
    sh "docker build -t ${image} ."
}
