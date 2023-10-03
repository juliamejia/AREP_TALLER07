package org.example;

import static spark.Spark.*;
public class Main {
    public static void main(String[] args) {
        port(5000);
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        secure("keystores/ecikeystore.p12", "123456", null, null);
        get("/hello", (req, res) -> "Hello World");
    }
}