def buildApp() {
    docker build -t techworld-js-docker-demo-app-dev .
    docker run -p 8080:5000 techworld-js-docker-demo-app-dev1 techworld-js-docker-demo-app-dev 
    
} 

def testApp() {
    echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
