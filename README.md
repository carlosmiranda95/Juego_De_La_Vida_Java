# EL JUEGO DE LA VIDA

El Juego de la Vida , también conocido simplemente como Vida , es un autómata celular ideado por el matemático británico John Horton Conway en 1970. 
El juego es un juego de cero jugadores , lo que significa que su evolución está determinada por su estado inicial, que no requiere más información. Uno interactúa con el Juego de la Vida creando una configuración inicial y observando cómo evoluciona, o, para jugadores avanzados, creando patrones con propiedades particulares.

# Reglas

El universo del Juego de la Vida es una cuadrícula ortogonal bidimensional infinita de celdas cuadradas , cada una de las cuales se encuentra en uno de los dos estados posibles, vivo o muerto (o poblado y despoblado , respectivamente). Cada celda interactúa con sus ocho vecinos , que son las celdas que están adyacentes horizontal, vertical o diagonalmente. En cada paso en el tiempo, ocurren las siguientes transiciones:
Cualquier célula viva con menos de dos vecinos vivos muere, como por subpoblación.
Cualquier célula viva con dos o tres vecinos vivos vive hasta la próxima generación.
Cualquier célula viva con más de tres vecinos vivos muere, como por sobrepoblación.
Cualquier célula muerta con exactamente tres vecinos vivos se convierte en una célula viva, como por reproducción.

# Avance Realizado

Se realizaron dos metodos con la aplicacion de Test Driven Development

- Creacion de Tabla base o matriz, el parametro de dimension del universo esta ajustado a la cantidad
- Poblacion de la Tabla o matriz, en la cual se pobla la matriz segun la cantidad de celulas que especifique

# Correr Pruebas Unitarias

La ejecucion de las pruebas se realiza mediante el framework Junit, el proyecto esta desarrollado en NetBeans, por lo tanto su ejecucion requiere tener el IDE instalado haciendo click en la clase Test y ejecutar la prueba.
