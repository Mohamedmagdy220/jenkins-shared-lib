def call() {
    echo "🚀 Deploying to Kubernetes..."
    sh "kubectl apply -f k8s/deployment.yaml"
}

