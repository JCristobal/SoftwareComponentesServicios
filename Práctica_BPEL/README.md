### Práctica con BPEL
#### Especificación de un proceso de negocio con BPEL

Especificar utilizando WS-BPEL el proceso de negocio de "reservas de viajes" cuyo diagrama aparece en la imagen: 

![diagrama](http://i.imgur.com/IaOHt6G.png) 

*Diagrama realizado por el profesor Manuel I. Capel*


La descripción textual del mismo es como sigue: el cliente invoca al proceso de negocio, especificando el nombre del empleado, el destino de su viaje, la fecha de salida y de regreso. El proceso de negocio BPEL comprueba primero la categoría del empleado que va a viajar, que se corresponden con estos tipos de pasaje de avión: (1) clase turista, (2) clase business y (3) avión privado. Suponemos que disponemos de un SW contra el que se puede hacer la consulta, después de dicha consulta, el proceso BPEL comprobará el precio del billete con 2 líneas aéreas diferentes para encontrar mejor precio; suponemos otra vez que ambas compañías proporcionan un SW que permite realizar todas las gestiones anteriores. Por último, el proceso BPEL seleccionará el precio más bajo y devolverá un plan de viaje al cliente, para su aprobación. 



Para crear el proyecto:

1 - Descargarnos el desplegable [ode.war](http://www.apache.org/dyn/closer.cgi/ode/apache-ode-war-1.3.6.zip) del sitio de distribución oficial de Apache

2 - Ubicarlo en el directorio "webapps" de Tomcat y arrancando el sistema, crearemos un nuevo servicio "ode".

3 - Dentro del IDE Eclipse, crear un nuevo proyecto BPEL y rellenamos la información que nos pide al avanzar con la ubicación del * servicio ODE recién creado* y de Tomcat.

4 - Con el proyecto BPEL ya creado, creamos un nuevo *BPEL Process file* dentro de la carpeta *bpelContent* (en mi caso con la plantilla de proceso síncrono) y se lo asignamos. Ya estaría el "esqueleto" creado. )

5 - Editado el proyecto hasta llegar a un solución (en el [primer caso](), una simple [asignación]() ).

6 - En el archivo .wsdl asignamos la dirección de puerto a http://localhost:8080/ode/processes/negocio

7 - Para desplegar el servicio: clicamos en el carpeta *bpelContent* y seleccionamos New > Others > BPEL 2.0 > BPEL Deployment Descriptor.

8 - Arranacaremos el servidor ODE mediante Tomcat y consultamos, en mi caso, http://localhost:8080/ode/processes/negocio

(nos da una excepción, ya que se ejecuta con SOAP en vez de HTML, lenguaje que interpreta el navegador)



