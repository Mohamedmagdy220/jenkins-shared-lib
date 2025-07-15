def call() {
    echo "Scanning Docker image with Trivy..."
    sh "trivy image your-dockerhub-username/demo-app:latest || true"
}
