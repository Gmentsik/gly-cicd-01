We will create a CI/CD pipeline for a Java Microservice. This service will run in a docker-container.

The pipeline will be triggered when pushing to the git repo. We will define some tasks that will be automatically executed.

- Run Tests with Junit / Maven
- Compile and Pack the application
- Build and push the docker image

You will need to have a properly configured Gitlab instance with a connected gitlab-runner.

Checkout the Full Blog Post:
https://gerge.ly/how-to-ci-cd-in-gitlab/

