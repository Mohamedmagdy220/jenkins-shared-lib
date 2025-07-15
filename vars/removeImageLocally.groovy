def call() {
    echo "Removing local Docker image..."
    sh "docker rmi your-dockerhub-username/demo-app:latest || true"
}
