[![Build Status](https://travis-ci.org/ExampleDriven/spring-cloud-config-example.svg)](https://travis-ci.org/ExampleDriven/spring-cloud-config-example)

# spring-cloud-config-example

This is the source code for the blog post

http://exampledriven.wordpress.com/TBD

This example covers the following :

- Cloud config server
- @RefreshScope
- NativeEnvironmentRepository

To run this project
    mvn clean install

then execute

    mvn spring-boot:run

in the following directories in the following order
- configserver
- configserver-client

