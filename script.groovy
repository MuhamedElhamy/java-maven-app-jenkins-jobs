def buildApp() {
    echo "Building the app..."
}

def testApp() {
    echo "Testing the app..."
}

def deployApp() {
    echo "Deploying the app..."
    echo "Deploying version ${params.VERSION}"
}

return this
