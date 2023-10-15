package org.example.Server2;

import org.example.SecureUrlReader;

import static spark.Spark.*;

public class Main2 {
    public static void main(String[] args) {
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath, truststorePassword);
        secure(getKeyStore(), getPwdKeyStore(), null, null);
        port(getPort());
        get("/conexionlocal", (req, res) -> "Hola!! Soy el servidor 2");
        get("/conexionremota", (req,res)-> SecureUrlReader.main(getUrl(),getOtherKeyStore(),getPwdKeyStore()));
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5001; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

    static String getUrl(){
        if(System.getenv("URL") != null){
            return System.getenv("URL");
        }
        return "https://localhost:5000/conexionlocal";
    }


    static String getKeyStore(){
        if(System.getenv("KEYSTORE")!=null){
            return System.getenv("KEYSTORE");
        }
        return "keystores/ecikeystore1.p12";
    }

    static String getOtherKeyStore(){
        if(System.getenv("KEYSTORE")!=null){
            return System.getenv("KEYSTORE");
        }
        return "keystores/ecikeystore.p12";
    }

    static String getPwdKeyStore(){
        if(System.getenv("PWDKEYSTORE")!=null){
            return System.getenv("PWDKEYSTORE");
        }
        return "123456";
    }
}