def deploy() {
	echo "Deploying code"
	sh "docker-compose down && docker-compose up -d"
}
