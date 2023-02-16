package com.example.hello;

import com.google.api.gax.rpc.ClientSettings;
import com.google.maps.routing.v2.RoutesClient;
import com.google.maps.routing.v2.RoutesSettings;
import java.io.IOException;

public class Main {

  public static void main(String[] arguments) throws IOException {
    System.out.println("Hello Maps Java Library");
    RoutesSettings routesSettings = RoutesSettings.newBuilder().build();
    System.out.println("RoutesSettings: " + routesSettings);
    RoutesClient routesClient = RoutesClient.create(routesSettings);
    System.out.println("Client: " + routesClient);
  }
}
