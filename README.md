# Test code to run google-maps-routing

The source code of the google-maps-routing library is
https://github.com/googleapis/google-cloud-java/tree/main/java-maps-routing.

It's been published to Maven Central:

```
<dependency>
  <groupId>com.google.maps</groupId>
  <artifactId>google-maps-routing</artifactId>
  <version>0.1.0</version>
</dependency>
```

Install Java and Maven. I use Java 8.

## Run in IntelliJ

Open this project in IntelliJ. Make the IDE recognize it as Maven project.

Run Main.java.

## Run in Maven

The pom.xml is setup to run the main class. 

Compile the project and run `mvn exec:java`:

```
suztomo@suztomo2:~/hello-maps-routes$ mvn compile
...
suztomo@suztomo2:~/hello-maps-routes$ mvn exec:java
[INFO] Scanning for projects...
[INFO]
[INFO] -------------------< org.example:hello-maps-routes >--------------------
[INFO] Building hello-maps-routes 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- exec-maven-plugin:3.1.0:java (default-cli) @ hello-maps-routes ---
Hello Maps Java Library
RoutesSettings: RoutesSettings{executorProvider=null, backgroundExecutorProvider=InstantiatingExecutorProvider{executorThreadCount=12, threadFactory=com.google.api.gax.core.InstantiatingExecutorProvider$1@1d792cd7}, transportChannelProvider=com.google.api.gax.grpc.InstantiatingGrpcChannelProvider@73ebc376, credentialsProvider=GoogleCredentialsProvider{scopesToApply=[], jwtEnabledScopes=[], useJwtAccessWithScope=true, OAuth2Credentials=null}, headerProvider=com.google.api.gax.rpc.NoHeaderProvider@9a655fc, internalHeaderProvider=com.google.api.gax.rpc.ApiClientHeaderProvider@28b0f84d, clock=com.google.api.core.NanoClock@7c7b6618, endpoint=routes.googleapis.com:443, quotaProjectId=null, watchdogProvider=com.google.api.gax.rpc.InstantiatingWatchdogProvider@51a6ea92, watchdogCheckInterval=PT10S}
Client: com.google.maps.routing.v2.RoutesClient@64f0a6d7
```