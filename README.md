# Universidad Politecnica Salesiana 
![ups-icc](https://github.com/PaulSebastianNaspud/estructura-u2-pratica3/assets/131235143/d8801de9-eea7-49f5-9594-fe27f5d55528) 

# Estructura de Datos Proyectos de Fin de ciclo

### Integrantes: Paul Naspud [PaulSebastianNaspud](https://github.com/PaulSebastianNaspud) 
pnaspudv@est.ups.edu.ec
### Karen Quito [kquitol](https://github.com/kquitol)
kquitol@est.ups.edu.ec

### Docente: 

## Gestor de Contactos con Árbol Binario de Búsqueda

# 1. Descripción del Proyecto

Este proyecto aspira a diseñar un sistema sofisticado para la administración de una lista de contactos telefónicos. Atrabez de la implementación 
de estructuras de datos conocidas como Árbol Binario de Búsqueda (ABB). Esta estructura de árbol permite optimizar eficazmente las operaciones  
fundamentales de adición, búsqueda y eliminación de contactos. Cada contacto en el sistema es una entidad multifacética, que incluye un nombre, un número de 
teléfono, una colección de correos electrónicos y un diccionario que registra las redes sociales del contacto. Es interesante destacar que en este diccionario, la 
red social actúa como clave, lo que facilita el acceso y la gestión de la información.

## 1.1 Clases Principales
- **Contacto** : Encapsula los datos esenciales de un contacto: nombre, número de teléfono, correos electrónicos y redes sociales.
- **Nodo** : Representa los nodos del ABB. Cada nodo contiene un objeto 'Contacto' y referencias a sus nodos hijos (izquierdo y derecho).
- **ArbolContactos** : Representa el ABB y mantiene su estructura. Proporciona métodos para agregar, buscar y eliminar contactos.
  
## 1.2 Funcionalidades
- **Inserción ordenada**: Utilizando las propiedades del ABB, los contactos se insertan de forma ordenada basándose en el nombre del contacto.
- **Búsqueda y eliminación eficiente**: Permite buscar y eliminar un contacto por nombre utilizando las propiedades del ABB para optimizar estas operaciones.
- **Métodos de recorrido del árbol**: Implementa los métodos de recorrido del árbol (preorden, inorden, postorden, anchura) para visualizar los contactos en
  diferentes secuencias.
  
## 1.3 Uso
El programa principal interactúa con el usuario a través de un menú de opciones, donde puede seleccionar la operación de gestión de contactos que desea realizar.
El sistema utiliza objetos de las clases Contacto, Nodo y ArbolContactos para ejecutar las operaciones correspondientes.

# 2. Desarrollo

## 2.1 Modelo-Vista-Controlador (MVC)
El diseño y desarrollo del sistema sigue el patrón de diseño Modelo-Vista-Controlador (MVC):
-  **Modelo**: Compuesto por las clases Contacto, Nodo y ArbolContactos, cada una representando diferentes componentes del sistema.
- **Vista**: Gestiona la representación visual e interactiva de los datos del modelo.
- **Controlador**: Coordina las interacciones entre el modelo y la vista, gestiona las entradas del usuario y actualiza la vista y el modelo según corresponda.

## 2.2 Convenciones de Java
El desarrollo se realiza siguiendo las convenciones estándar de código Java, lo que abarca los nombres de las clases, métodos, variables y constantes. El uso de   
CamelCase y guiones bajos asegura un código coherente, legible y mantenible.

# 3. Codigo
A continuacion se profundizará en el análisis de algunos métodos para la implementación del (ABB) en nuestro sistema de gestión de contactos. Se pondrá especial
atención a aquellos métodos que emplean la técnica de la recursión, dada su relevancia y su rol crucial en las operaciones de este tipo de estructura de datos.

## 3.1 Ejemplo
### Metodo de inserccion
El código representa la implementación de un Árbol Binario de Búsqueda (ABB) para manejar una lista de contactos. Incluye tres métodos esenciales:
- insert(Contacto newContacto): Es el método público inicial para la inserción de un nuevo contacto en el ABB. Si el árbol está vacío, genera una nueva raíz; si no,
  desencadena un procedimiento de inserción recursiva.
- insertResursivo(Node node, Contacto newContacto): Realiza el procedimiento de inserción de un contacto en el ABB de manera recursiva, comparando los nombres de
  los contactos y determinando la ubicación adecuada del nuevo contacto en el árbol.
  
![Metodo de insertar](https://github.com/PaulSebastianNaspud/estructura-u2-pratica3/assets/131235143/c39105b5-7bf7-408e-ae92-aa35dc63c06d)

### Metodo eliminar contacto
- eliminarContacto sirve como punto de entrada, iniciando la eliminación recursiva desde la raíz del árbol.
- eliminarContactoRecimplementa la eliminación recursiva. Si el árbol está vacío, se devuelve null. Si no, se compara el nombre del contacto a eliminar con el
  nombre del contacto en el nodo actual y se decide si buscar en el subárbol izquierdo o derecho. Si se encuentra una coincidencia, el nodo se elimina de acuerdo
  con uno de los tres casos.

![Eliminar Recursivo](https://github.com/PaulSebastianNaspud/estructura-u2-pratica3/assets/131235143/416b2d52-344f-4def-bd6a-a9a3e8691308)

## 4. Resultados

El sistema de gestión de contactos, implementando un Árbol Binario de Búsqueda (ABB), ha probado ser una solución eficiente para el manejo de contactos. El ABB, con su capacidad para realizar operaciones de inserción, búsqueda y eliminación en tiempo logarítmico, ha proporcionado una mejora significativa en el rendimiento en comparación con estructuras de datos lineales como listas o arrays.

## 5. Conclusiones

El desarrollo de este sistema de gestión de contactos ha proporcionado una experiencia práctica valiosa en la implementación de un Árbol Binario de Búsqueda (ABB) 
y el patrón de diseño Modelo-Vista-Controlador (MVC) en Java. A través de la resolución de los retos que suponía la creación del sistema, se han adquirido 
habilidades sólidas en estructuras de datos, algoritmos de búsqueda y programación orientada a objetos.

El uso de GitHub para el control de versiones y el manejo del proyecto ha facilitado el seguimiento de los cambios y la colaboración, sino que también ha permitido 
documentar de manera efectiva el desarrollo.

El proyecto ha demostrado cómo la correcta aplicación de las convenciones de código de Java puede conducir a un código más legible y mantenible. A su vez, se ha 
evidenciado cómo el patrón MVC contribuye a la organización del código, permitiendo la separación de responsabilidades y facilitando la escalabilidad del proyecto.

## 6. Recomendaciones

Para futuros mejoras:

- **Manejo de Contactos Duplicados**: Permitir contactos con el mismo nombre pero con diferentes datos de contacto (p.ej., número de teléfono, correo electrónico).

- **Persistencia de Datos**: Implementar una funcionalidad para el almacenamiento persistente de contactos, de modo que los datos no se pierdan cuando el programa
- se cierra. Esto podría lograrse con archivos, bases de datos o servicios en la nube.

- **Interfaz de Usuario**: Desarrollar una interfaz de usuario gráfica que sea intuitiva y fácil de usar. Esto permitiría a los usuarios interactuar con el sistema
  de manera más eficiente y mejorar la experiencia del usuario en general.
  
## 7. Anexos de Bibliotecas
- import java.util.LinkedList: La biblioteca LinkedList en Java se utiliza para implementar listas enlazadas, que proporcionan una manipulación eficiente de
  elementos al permitir inserciones y eliminaciones rápidas.
- import java.util.Queue: La biblioteca Queue en Java es una interfaz que se utiliza para implementar estructuras de datos del tipo cola, que operan bajo el
  principio de primero en entrar, primero en salir (FIFO).
- import java.util.Map: La biblioteca Map en Java es una interfaz que representa una estructura de datos que mapea claves únicas a valores, útil para el
  almacenamiento y recuperación eficiente de datos.

## 8. Herramientas
- NetBeabs 17
- JDK 17
- Visual Studio Code 1.80.1

## Otros
[Pagina web Carbono](https://carbon.now.sh/?bg=rgba(171%2C%20184%2C%20195%2C%201)&t=material&wt=none&l=text%2Fx-php&ds=true&dsyoff=20px&dsblur=68px&wc=true&wa=true&pv=47px&ph=32px&ln=false&fm=Hack&fs=14px&lh=133%25&si=false&es=2x&wm=false)
[Documentacion Markdown](https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
[Java util](https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html)
