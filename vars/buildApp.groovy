def call() {
    echo "Building app with Maven..."
    sh "mvn clean package"
}
