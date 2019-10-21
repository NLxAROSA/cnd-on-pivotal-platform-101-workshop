## Cloud Native Development on Pivotal Platform 101 - Workshop
This workshop will focus on writing a few Spring Boot applications and will teach you how to deploy them to Pivotal Platform (more specifically Cloud Foundry), provision a database and connect to it, inject configuration at runtime and setup a service registry and a circuit breaker. All with little to no developer hassle or setup. While this workshop is executed using Pivotal Platform, most of the exercises also work quite happily on other brands or OSS Cloud Foundry.

[Getting started with Pivotal Platform](https://pivotal.io/platform/pcf-tutorials/getting-started-with-pivotal-cloud-foundry)


## Prerequisites

We expect you to bring:

* A laptop with Windows, Linux or MacOS
* A working internet connection
* An IDE or code editor of your choice

We expect you have installed:

* [JDK11 or higher](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot)
* [Cloud Foundry CLI](https://docs.run.pivotal.io/cf-cli/install-go-cli.html)

We expect you to be familiar with Java, but if you're not it's also ok as working source code for every exercise is provided.

Login credentials and access to the environment will be provided by the instructor(s).


## Verify PCF CLI is working

```bash
cf -v
```

Login to Cloud Foundry:

```bash
cf login -a https://api.sys.lropcf.pushto.cf
Email> <provided user>
Password> <provided password>
```


## Build the project

For every exercise we need to build the project: 

```bash
mvn clean package
```

In case you don't have Maven installed run: 

```bash
./mvnw clean package
```


## Run the application locally

Before we push the application to Cloud Foundry run it locally first!

```bash
./mvnw spring-boot:run
```

Open in the browser: [http://localhost:8080/](http://localhost:8080/)


## Exercises

* Exercise 1: [start](01-scaling/exercise-1-start.md), [solution](01-scaling/exercise-1-solution.md)
* Exercise 2: [start](02-security/exercise-2-start.md), [solution](02-security/exercise-2-solution.md)
* Exercise 3: [start](03-robustness-resilience/exercise-3-start.md), [solution](03-robustness-resilience/exercise-3-solution.md)
* Exercise 4: [start](04-caching/exercise-4-start.md), [solution](04-caching/exercise-4-solution.md)
* Exercise 5: [start](05-metrics-logging/exercise-5-start.md), [solution](05-metrics-logging/exercise-5-solution.md)
* Exercise 6: [start](06-messaging/exercise-6-start.md), [solution](06-messaging/exercise-6-solution.md)


## Tips

* Stuck? The exercises have hints to help you!
* Stuck? Ask your neighbour to pair with you!
* Stuck? Every exercise has a working solution right here!
