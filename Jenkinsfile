pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                // Clonez le dépôt Git
                bat 'git clone https://github.com/Mariamatambedou/pipelinejks.git pipelinejks'
            }
        }

        stage('Build') {
            steps {
                // Construisez votre projet Spring Boot avec Maven
                bat 'mvn clean install -f pipelinejks/pom.xml'
            }
        }

        stage('Archive JAR') {
            steps {
                // Archive the JAR file as an artifact
                archiveArtifacts artifacts: 'pipelinejks/target/*.jar', allowEmptyArchive: true
            }
        }

        stage('Run') {
            steps {
                // Exécutez votre application Spring Boot avec le nouveau port
                bat 'java -jar pipelinejks/target/demo-0.0.1-SNAPSHOT.jar --server.port=8081'
            }
        }

        stage('Test') {
           steps {
        // Exécutez les tests Maven par défaut
            bat 'mvn test -f pipelinejks/pom.xml'
            }
        }

    }
    }
