def call() {
    echo "Building Docker image..."
    sh "docker build -t your-dockerhub-username/demo-app:latest ."
}
