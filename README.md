# Universidad Politecnica Salesiana 
![ups-icc](https://github.com/PaulSebastianNaspud/estructura-u2-pratica3/assets/131235143/d8801de9-eea7-49f5-9594-fe27f5d55528) 

# Estructura de Datos Proyectos de Fin de ciclo

### Integrantes: Paul Naspud @PaulSebastianNaspud , Karen Quito @KQuitol
### Docente: 

## Gestor de Contactos con Árbol Binario de Búsqueda

# 1. Descripción del Proyecto
Este proyecto aspira a diseñar un sistema sofisticado para la administración de una lista de contactos telefónicos. Nuestra estrategia se basa en la    
implementación de una estructura de datos conocida como Árbol Binario de Búsqueda (ABB). Esta estructura de árbol permite optimizar eficazmente las operaciones  
fundamentales de adición, búsqueda y eliminación de contactos.
Cada contacto en el sistema es una entidad multifacética, que incluye un nombre, un número de teléfono, una colección de correos electrónicos y un diccionario que 
registra las redes sociales del contacto. Es interesante destacar que en este diccionario, la red social actúa como clave, lo que facilita el acceso y la gestión
de la información.

## 1.1 _Clases Principales
- **Contacto** : Encapsula los datos esenciales de un contacto: nombre, número de teléfono, correos electrónicos y redes sociales.
- **Nodo** : Representa los nodos del ABB. Cada nodo contiene un objeto 'Contacto' y referencias a sus nodos hijos (izquierdo y derecho).
- **ArbolContactos** : Representa el ABB y mantiene su estructura. Proporciona métodos para agregar, buscar y eliminar contactos.
  
## 1.2 Funcionalidades
Inserción ordenada: Utilizando las propiedades del ABB, los contactos se insertan de forma ordenada basándose en el nombre del contacto.
Búsqueda y eliminación eficiente: Permite buscar y eliminar un contacto por nombre utilizando las propiedades del ABB para optimizar estas operaciones.
Métodos de recorrido del árbol: Implementa los métodos de recorrido del árbol (preorden, inorden, postorden, anchura) para visualizar los contactos en diferentes
secuencias.
  
## 1.3 Uso
El programa principal interactúa con el usuario a través de un menú de opciones, donde puede seleccionar la operación de gestión de contactos que desea realizar.
El sistema utiliza objetos de las clases Contacto, Nodo y ArbolContactos para ejecutar las operaciones correspondientes.

# 2. Desarrollo

## 2.1 Modelo-Vista-Controlador (MVC)
El diseño y desarrollo del sistema sigue el patrón de diseño Modelo-Vista-Controlador (MVC):
-  **Modelo**: Compuesto por las clases `Contacto`, `Nodo` y `ArbolContactos`, cada una representando diferentes componentes del sistema.
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
- getRoot(): Proporciona el nodo raíz del ABB.
- insertResursivo(Node node, Contacto newContacto): Realiza el procedimiento de inserción de un contacto en el ABB de manera recursiva, comparando los nombres de
  los contactos y determinando la ubicación adecuada del nuevo contacto en el árbol.
![Metodo de In... Recursivo](https://github.com/PaulSebastianNaspud/estructura-u2-pratica3/assets/131235143/82da8ac2-aad9-4d72-85a5-1e14ff091f45)



