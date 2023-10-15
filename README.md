# Taller7 AREP
### Julia Marcela Mejia Perez
Desarrolle una aplicación Web segura con los siguientes requerimientos:  
1. Debe permitir un acceso seguro desde el browser a la aplicación. Es decir debe garantizar autenticación, autorización e integridad de usuarios.
2. Debe tener al menos dos computadores comunicacndose entre ellos y el acceso de servicios remotos debe garantizar: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.
3. Explique como escalaría su arquitectura de seguridad para incorporar nuevos servicios.
 ## EJECUCION  
 1. Clonar el repositorio usando este codigo desde el cmd, en la carpeta que gustes  
    `git clone https://github.com/juliamejia/AREP_TALLER07.git`

2. Dentro de la carpeta llamada AREP_Taller7, donde se encuentra el archivo POM, abrimos el cmd y ejecutamos el siguiente comando  
   `mvn clean install`
3. Compilamos y ejecutamos `Main1.java` y `Main2.java`
   nos deberia mostrar algo como esto
   <img width="904" alt="image" src="https://github.com/juliamejia/AREP_TALLER07/assets/98657146/20b254b8-3c14-49b6-b625-091fff4cf4df">  
4. Por medio del siguiente link en cualquier browser https://localhost:5000/conexionlocal para el Servidor1  
   <img width="296" alt="image" src="https://github.com/juliamejia/AREP_TALLER07/assets/98657146/7b328828-762e-4e62-bd04-8ceb0d0b5626">  
   y https://localhost:5001/conexionlocal para el Servidor2  
   <img width="392" alt="image" src="https://github.com/juliamejia/AREP_TALLER07/assets/98657146/5c55d65a-abbd-4b9e-b48d-147c31e72c1e">  

5. Para conectarse entre ellos localmente:  
   conexion del Servidor2 -> Servidor1: https://localhost:5001/conexionremota  
   <img width="295" alt="image" src="https://github.com/juliamejia/AREP_TALLER07/assets/98657146/de64e583-9304-44b7-bdb5-844662104a56">  
   conexion del Servidor1 -> Servidor2: https://localhost:5000/conexionremota  
   <img width="322" alt="image" src="https://github.com/juliamejia/AREP_TALLER07/assets/98657146/04b0b058-f584-4d16-a796-970db149ed92">

## AWS  
Despues de crear una instancia, clonar el repositorio en aws y editar cada una de las clases con el link respectivo de AWS, ejecutamos en una consola desde la carpeta raiz:
`mvn clean install`  
`java -cp "target/classes:target/dependency/*" org.example.Server1.Main1`  
y `java -cp "target/classes:target/dependency/*" org.example.Server2.Main2`  en consolas distintas de la misma instancia de AWS  
A continuacion adjunto el video de la prueba que se realiza enn AWS:  
[Video Demostracion en AWS](https://www.youtube.com/watch?v=u2Wl_sxUcvc)  

## ARQUITECTURA  

   






   
