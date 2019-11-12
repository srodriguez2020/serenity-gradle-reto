# Reto Automatizacion

[![N|Solid](http://www.thucydides.info/img/serenity-bdd.png)](https://nodesource.com/products/nsolid)

Se ha creado un proyecto con Gradle, en donde se han adicionado las librerias necesarias para poder ejecutar pruebas automatizadas: 

* Selenium
* Serenity BDD
* Junit 4

Se uso el patron ScreenPlay y el principio Solid, en adicion se ha incluido el Driver de Chrome version (78.0.3904.70) puede que en donde se ejecute la prueba el driver deba ser cambiado en la ruta: (src/test/resources/chromedriver.exe) del proyecto . 

# Como ejecutar!

Ejecute los siguiente comando en una consola GIT

##### Descargar project:
.
```sh
$ git clone https://github.com/srodriguez2020/serenity-gradle-reto.git
$ cd serenity-gradle-reto
```
##### Ejecutar project
.
     
```sh
$ gradle test
```

# Resultados!
Despues de la ejecucion encontrara los reportes de Serenity, ubicados en: 

* {directory.Proyect}/target/site/serenity/{Hash}.html
* {directory.Proyect}/build/reports/tests/test/classes/net.reto.automation.ShopProduct.html
