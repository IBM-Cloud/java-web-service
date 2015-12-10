# Java Web Service RESTful API

A simple Java application which uses the WebSphere Liberty's jax-rs feature to implement an RESTful Web Services API

`src/main/java/com/example/HelloResource` is a resource which listens on /api/hello and responds with a message in JSON format.

`src/main/webapp/index.html` calls the above resource to display the message in the UI.

## Deploy this application:

Import and deploy to Bluemix or a local Liberty server using [Eclipse for Java EE](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/keplersr2) with the [Bluemix plugin](https://marketplace.eclipse.org/content/ibm-eclipse-tools-bluemix). In your local Liberty server, be sure to add the jaxrs-1.1 or jaxrs-2.2 feature to your server.xml

[Video: Deploy to Bluemix using Eclipse](https://www.youtube.com/watch?v=Ro0CSPeoFoY)

Enjoy!