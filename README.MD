# Guía #3 - Diseño e Interfaces

## Descripción

Esta guía tiene como objetivo trabajar con **interfaces**, **implementación de comportamientos comunes**, **herencia de interfaces** y **enumeradores (`enum`)** en Java.

La guía está compuesta por tres ejercicios.

---

# Ejercicio 1 - Sistema de transporte urbano

Implementar un sistema básico para la gestión de diferentes tipos de transporte urbano.

Se deberán utilizar:

* **Interfaces** para definir comportamientos comunes.
* **Enumeradores** para representar los diferentes tipos de transporte.

## 1.1 Enumerador `TipoTransporte`

Crear un enumerador llamado `TipoTransporte` con los siguientes valores:

```text
AUTOBUS
TRANVIA
TREN
BICICLETA
```

## 1.2 Interfaz `Transporte`

Crear una interfaz llamada `Transporte` que defina los siguientes métodos:

```java
arrancar()
detener()
obtenerCapacidad()
```

## 1.3 Clase `Autobus`

La clase `Autobus` debe implementar la interfaz `Transporte`.

### Atributos

* `numeroLinea` - entero
* `capacidad` - entero
* `tipo` - `TipoTransporte`

### Métodos

Debe implementar los métodos definidos en `Transporte`.

Además, debe incorporar:

```java
anunciarParada(String parada)
```

Este método permitirá anunciar la próxima parada.

## 1.4 Clase `Tranvia`

La clase `Tranvia` debe implementar la interfaz `Transporte`.

### Atributos

* `ruta` - cadena de texto
* `capacidad` - entero
* `tipo` - `TipoTransporte`

### Métodos

Debe implementar los métodos definidos en `Transporte`.

Además, debe incorporar:

```java
cambiarVia(int nuevaVia)
```

Este método permitirá cambiar de vía.

## 1.5 Clase `Bicicleta`

La clase `Bicicleta` debe implementar la interfaz `Transporte`.

### Atributos

* `numeroSerie` - cadena de texto
* `tipo` - `TipoTransporte`

### Métodos

Debe implementar los métodos definidos en `Transporte`.

Además, debe incorporar:

```java
ajustarAsiento(int altura)
```

Este método permitirá ajustar la altura del asiento.

El método:

```java
obtenerCapacidad()
```

debe devolver `1`, ya que la bicicleta tiene capacidad para una sola persona.

## 1.6 Clase `Main`

En la clase `Main` se deberá:

1. Crear instancias de cada clase:

    * `Autobus`
    * `Tranvia`
    * `Bicicleta`

2. Simular:

    * El arranque.
    * La detención.
    * La obtención de la capacidad.

3. Mostrar por consola:

    * El tipo de transporte.
    * El estado de cada transporte.

---

# Ejercicio 2 - Animales y habilidades

Crear una simulación para modelar diferentes animales de un bosque mágico.

Los animales que se deberán representar son:

* Pato
* Murciélago
* Pez

Cada animal debe poder realizar actividades comunes como:

* Comer.
* Dormir.

Además, cada uno deberá disponer de sus habilidades particulares.

## Animales y habilidades

### Pato

El pato:

* Camina.
* Vuela sobre el agua.
* Nada bajo el agua.

### Murciélago

El murciélago:

* Vuela en la oscuridad.
* Se cuelga boca abajo en cuevas.

### Pez

El pez:

* No puede volar.
* No puede caminar.
* Se desplaza en las profundidades del océano.

## Comunicación y sonidos

La simulación también debe contemplar cómo se comunican los animales y qué sonidos pueden emitir cuando:

* Están felices.
* Están en peligro.

## Objetivo

Crear una estructura de clases que permita:

* Modelar los diferentes animales.
* Permitir que coman.
* Permitir que duerman.
* Ejecutar sus habilidades especiales.
* Organizar el código de manera que sea fácil de entender y modificar.

La estructura deberá permitir que las habilidades específicas de cada animal puedan ejecutarse cuando sean requeridas.

---

# Ejercicio 3 - Gestión de vehículos

Desarrollar una aplicación en Java para gestionar diferentes tipos de vehículos.

Todos los vehículos poseen características básicas:

* Marca.
* Modelo.
* Velocidad máxima.

Algunos vehículos también poseen capacidades específicas, como:

* Transportar pasajeros.
* Transportar carga.

## 3.1 Interfaz `Vehiculo`

Crear una interfaz llamada `Vehiculo` que defina los métodos básicos que todos los vehículos deben implementar.

## 3.2 Interfaz `VehiculoDePasajeros`

Crear una interfaz llamada `VehiculoDePasajeros` que extienda de:

```java
Vehiculo
```

Esta interfaz estará destinada a los vehículos que transportan pasajeros.

## 3.3 Interfaz `VehiculoDeCarga`

Crear una interfaz llamada `VehiculoDeCarga` que extienda de:

```java
Vehiculo
```

Esta interfaz estará destinada a los vehículos que transportan carga.

## 3.4 Tipos de vehículos

El sistema debe permitir crear diferentes tipos de vehículos, por ejemplo:

* Automóviles.
* Camiones.
* Autobuses.
* Bicicletas.

Cada vehículo deberá implementar la interfaz que corresponda según sus características.

### Automóvil

El automóvil será un vehículo de pasajeros.

Debe implementar un método que permita establecer la cantidad de pasajeros que puede transportar.

### Camión

El camión será un vehículo de carga.

Debe implementar un método que permita establecer su capacidad de carga en toneladas.

### Bicicleta

Determinar qué interfaz debe implementar una bicicleta de acuerdo con sus características.

## 3.5 Sistema de gestión

Finalmente, crear un programa que permita:

1. Agregar diferentes vehículos a un sistema de gestión.
2. Mostrar los vehículos por pantalla.
3. Mostrar sus características.
4. Mostrar sus capacidades correspondientes.

---

# Objetivos de la guía

Al finalizar la guía se deberá haber trabajado con:

* Interfaces.
* Implementación de interfaces.
* Herencia entre interfaces.
* Enumeradores (`enum`).
* Clases concretas.
* Métodos específicos según el comportamiento de cada clase.
* Polimorfismo.
* Modelado de objetos mediante Java.

## Estructura sugerida

```text
Guia3/
│
├── src/
│   ├── ejercicio1/
│   │   ├── TipoTransporte.java
│   │   ├── Transporte.java
│   │   ├── Autobus.java
│   │   ├── Tranvia.java
│   │   ├── Bicicleta.java
│   │   └── Main.java
│   │
│   ├── ejercicio2/
│   │   └── ...
│   │
│   └── ejercicio3/
│       └── ...
│
└── README.md
```

## Estado

* [ ] Ejercicio 1 - Transporte urbano
* [ ] Ejercicio 2 - Animales y habilidades
* [ ] Ejercicio 3 - Gestión de vehículos
* [ ] Pruebas de funcionamiento
* [ ] Revisión final
