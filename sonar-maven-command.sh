#!/bin/bash
cd /mnt/c/devops_bridge/timesheet-project/timesheet-project

# Nettoyer et compiler
mvn clean compile

# Lancer SonarQube
mvn sonar:sonar \
  -Dsonar.projectKey=timesheet-app \
  -Dsonar.projectName="Timesheet Application" \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=$(cat ~/.sonar-token) \
  -Dsonar.java.binaries=target/classes \
  -Dsonar.sources=src/main/java \
  -Dsonar.exclusions=**/target/** \
  -Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml
