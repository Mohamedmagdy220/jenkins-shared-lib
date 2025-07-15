def call() {
    echo "Pushing Docker image to Docker Hub..."
    sh "docker push your-dockerhub-username/demo-app:latest"
}
