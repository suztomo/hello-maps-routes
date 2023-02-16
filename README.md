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

## Setup

Install Java and Maven. I use Java 8 and Apache Maven 3.8.6.

```
suztomo@suztomo2:~/hello-maps-routes$ mvn -V
Apache Maven 3.8.6
Maven home: /usr/share/maven
Java version: 1.8.0_302, vendor: Oracle Corporation, runtime: /usr/local/google/home/suztomo/.sdkman/candidates/java/8.0.302-open/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "5.19.11-1rodete1-amd64", arch: "amd64", family: "unix"
```

## Run in IntelliJ

Open this project in IntelliJ. Make the IDE recognize it as Maven project.

Run Main.java.

```
Hello Maps Java Library
RoutesSettings: RoutesSettings{executorProvider=null, backgroundExecutorProvider=InstantiatingExecutorProvider{executorThreadCount=12, threadFactory=com.google.api.gax.core.InstantiatingExecutorProvider$1@6ad5c04e}, transportChannelProvider=com.google.api.gax.grpc.InstantiatingGrpcChannelProvider@6833ce2c, credentialsProvider=GoogleCredentialsProvider{scopesToApply=[], jwtEnabledScopes=[], useJwtAccessWithScope=true, OAuth2Credentials=null}, headerProvider=com.google.api.gax.rpc.NoHeaderProvider@725bef66, internalHeaderProvider=com.google.api.gax.rpc.ApiClientHeaderProvider@2aaf7cc2, clock=com.google.api.core.NanoClock@6e3c1e69, endpoint=routes.googleapis.com:443, quotaProjectId=null, watchdogProvider=com.google.api.gax.rpc.InstantiatingWatchdogProvider@1888ff2c, watchdogCheckInterval=PT10S}
Client: com.google.maps.routing.v2.RoutesClient@16c63f5
```

If you see the messages above, then it succeeded to instantiate `RoutesClient`.

## Run in Maven

Alternatively, you can run the main class in Maven.

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

If you see the messages above, then it succeeded to instantiate `RoutesClient`.