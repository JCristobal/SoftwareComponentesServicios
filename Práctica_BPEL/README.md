### Práctica con BPEL
#### Especificación de un proceso de negocio con BPEL

Especificar utilizando WS-BPEL el proceso de negocio de "reservas de viajes" cuyo diagrama aparece en la imagen: 

![diagrama](http://i.imgur.com/IaOHt6G.png) 

*Diagrama realizado por el profesor Manuel I. Capel*


La descripción textual del mismo es como sigue: el cliente invoca al proceso de negocio, especificando el nombre del empleado, el destino de su viaje, la fecha de salida y de regreso. El proceso de negocio BPEL comprueba primero la categoría del empleado que va a viajar, que se corresponden con estos tipos de pasaje de avión: (1) clase turista, (2) clase business y (3) avión privado. Suponemos que disponemos de un SW contra el que se puede hacer la consulta, después de dicha consulta, el proceso BPEL comprobará el precio del billete con 2 líneas aéreas diferentes para encontrar mejor precio; suponemos otra vez que ambas compañías proporcionan un SW que permite realizar todas las gestiones anteriores. Por último, el proceso BPEL seleccionará el precio más bajo y devolverá un plan de viaje al cliente, para su aprobación. 
