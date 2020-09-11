pipeline {
    agent any

    stages{
        stage('Preparation') {
            steps {
                git 'https://github.com/VladimirCW/group5.git'
            }
        }
        stage('Unit tests') {
            steps{
                bat 'mvn clean -DsuiteXmlFile=unit-tests.xml test'
            }
        }
        stage('UI tests') {
            steps{
                bat 'mvn clean -DsuiteXmlFile=ui-tests.xml test'
            }
        }
        stage('Deploy') {
            steps{
                echo 'Deployed'
            }
        }
        stage("Report") {
            steps {
                allure([
                    includeProperties: false,
                    jdk: '',
                    properties: [],
                    reportBuildPolicy: 'ALWAYS',
                    results: [[path: 'allure-results']]
                ])
            }
        }
    }
}