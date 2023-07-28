# Universidad Politecnica Salesiana 
![ups-icc](https://github.com/PaulSebastianNaspud/estructura-u2-pratica3/assets/131235143/d8801de9-eea7-49f5-9594-fe27f5d55528) 

# Estructura de Datos Proyectos de Fin de ciclo

### Integrantes: Paul Naspud @PaulSebastianNaspud , Karen Quito @KQuitol
### Docente: 

## Gestor de Contactos con Árbol Binario de Búsqueda
### Descripción del Proyecto
Este proyecto aspira a diseñar un sistema sofisticado para la administración de una lista de contactos telefónicos. Nuestra estrategia se basa en la implementación de una estructura de datos conocida como Árbol Binario de Búsqueda (ABB). Esta estructura de árbol permite optimizar eficazmente las operaciones fundamentales de adición, búsqueda y eliminación de contactos.

Cada contacto en el sistema es una entidad multifacética, que incluye un nombre, un número de teléfono, una colección de correos electrónicos y un diccionario que registra las redes sociales del contacto. Es interesante destacar que en este diccionario, la red social actúa como clave, lo que facilita el acceso y la gestión de la información.

## Clases Principales
'Contacto' : Encapsula los datos esenciales de un contacto: nombre, número de teléfono, correos electrónicos y redes sociales.
'Nodo' : Representa los nodos del ABB. Cada nodo contiene un objeto 'Contacto' y referencias a sus nodos hijos (izquierdo y derecho).
'ArbolContactos' : Representa el ABB y mantiene su estructura. Proporciona métodos para agregar, buscar y eliminar contactos.
## Funcionalidades
Inserción ordenada: Utilizando las propiedades del ABB, los contactos se insertan de forma ordenada basándose en el nombre del contacto.
Búsqueda y eliminación eficiente: Permite buscar y eliminar un contacto por nombre utilizando las propiedades del ABB para optimizar estas operaciones.
Métodos de recorrido del árbol: Implementa los métodos de recorrido del árbol (preorden, inorden, postorden, anchura) para visualizar los contactos en diferentes secuencias.
## Uso
El programa principal interactúa con el usuario a través de un menú de opciones, donde puede seleccionar la operación de gestión de contactos que desea realizar. El sistema utiliza objetos de las clases 'Contacto', 'Nodo' y 'ArbolContactos' para ejecutar las operaciones correspondientes.
