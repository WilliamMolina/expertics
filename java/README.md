
# wildfly-swarm
This is a Wildfly swarm microservice example.

## Build
    mvn clean install

## Run 

    java -jar target/wildfly-swarm-hello-swarm.jar



### Or do both using

    mvn wildfly-swarm:run



## Test

The service listens on port **8098**  

Try :
    http://127.0.0.1:8098/api/hello/world

You should get a response like this:

    {"greeting":"Hi world"}



