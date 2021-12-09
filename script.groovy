def buildApp() {
    docker build -t techworld-js-docker-demo-app-dev .
    
} 

def testApp() {
    echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
