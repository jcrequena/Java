Aplicación Multi Idioma En Java 
Se utiliza una clase Idioma (idioma.java) y ficheros properties que habrá que ir creando.
Hay que crear un fichero properties por cada idioma que se quiera mostrar.
En cada fichero, se usa este formato por cada elemento que se quiera traducir.
nombre_texto=valor
Ejemplo
--------------------------------
En el fichero espanol.properties:
titulo=Gesti\u00f3n de N\u00f3minas
saludo=Hola
cambio=Cambia idioma
espanol=Espa\u00f1ol
ingles=Ingl\u00e9s
--------------------------------
En el fichero ingles.properties:
titulo=Management of payroll
cambio=Change language
espanol=Spanish
ingles=English

-----------------------------
Código Fuente:

Hay que crear un atributo de la clase idioma y después se usa el metodo setText del elemento al que se quiere cambiar el nombre 
(JButton, JLabel, etcétera). 
Por último, dentro de ese método se invoca el método getProperty del objeto Idioma, como parámetro se pone el nombre del texto que se desea invocar. Ejemplo:
lblTitulo.setText(idioma.getProperty("titulo"));


Codificación de caracteres
https://www.indalcasa.com/programacion/html/tabla-de-codificaciones-de-caracteres-entre-ansi-utf-8-javascript-html/
