# Apache OpenWhisk Quarkus Starter

Download project:

```
$ git clone https://github.com/nheidloff/openwhisk-quarkus-starter.git
$ cd openwhisk-quarkus-starter
```

Build the image (replace 'nheidloff' with your Docker name):

```
$ mvn package -Pnative -Dnative-image.docker-build=true
$ docker build -t nheidloff/quarkus-serverless:1 .
$ docker push nheidloff/quarkus-serverless:1
```

Invoke the function locally:

```
$ docker run -i --rm -p 8080:8080 nheidloff/quarkus-serverless
$ curl --request POST \
  --url http://localhost:8080/run \
  --header 'Content-Type: application/json' \
  --data '{"value":{"name":"Niklas"}}'
```

Develop the function locally:

In order to change the implementation of the sample function, use your favorite Java IDE or text editor. When you run the following command, the application will be updated automatically every time you save a file:

```
mvn compile quarkus:dev
```

Create the OpenWhisk function:

```
ibmcloud login
ibmcloud fn action create echo-quarkus --docker nheidloff/quarkus-serverless:1 -m 128
```

Invoke the OpenWhisk function:
```
ibmcloud fn action invoke --blocking echo-quarkus --param name Niklas
```