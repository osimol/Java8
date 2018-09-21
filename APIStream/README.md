# JAVA 8 - Api Stream
A stream in Java is a sequence of data. A stream pipeline is the operations that run on a
stream to produce a result.

## Common Functional Interfaces
|Functional Interfaces | Parameters | Return Type | Single Abstract Method |
|------|-------|-------|-------|
|Supplier<T> |0| T |get|
|Consumer<T> |1 (T)| void |accept|
|BiConsumer<T, U> |2 (T, U) |void |accept|
|Predicate<T>| 1 (T) |boolean |test|
|BiPredicate<T, U>| 2 (T, U)| boolean |test|
|Function<T, R> |1 (T) |R |apply|
|BiFunction<T, U, R>| 2 (T, U) |R |apply|
|UnaryOperator<T> |1 (T)| T |apply|
|BinaryOperator<T>| 2 (T, T) |T |apply|


## 1. Predicate<T>
El metodo abstracto es:
```
boolean test(T t);
```

Comprueba si se cumple o no una condicion. Se utiliza mucho junto a expresiones lambda a la hora de filtrar:

```
list.stream().filter((p) -> p.getEdad() >= 35L)

Predicate<Persona> edad = (p) -> p.getEdad() >= 35L;
```

Se pueden componer predicados mas complejos con sus metodos **and** , **or** y **negate**.

Se pueden agrupar todos los predicados en una unica clase como en el ejemplo **PersonaPredicates**. 

## 2. Consumer<T>
Utiliza un Consumer cuando quieres hacer algo con un parámetro pero no devuelve nada. BiConsumer hace lo mismo, excepto que toma dos parámetros.
El método abstracto es:
```
void accept(T t);
```

Sirve para consumir objetos. Uno de los ejemplos más claros es imprimir.
```
//...    .forEach(System.out::println)
```

Adicionalmente, tiene el método andThen, que permite componer consumidores, para encadenar una secuencia de operaciones.

## 3. Function<T, R>
El método abstracto es:
```
R apply(T t);
```
Sirve para aplicar una transformación a un objeto. El ejemplo más claro es el mapeo de objetos en otros.
```
//...   .map((p) -> p.getNombre())
```
Adicionalmente, tiene otros métodos:

* **andThen** , que permite componer funciones.
* **compose** , que compone dos funciones, a la inversa de la anterior.
* **identity** , una función que siempre devuelve el argumento que recibe

## 4. Supplier<T>
El metodo abstracto es:
```
T get();
```
Sirve para devolver un valor.

Tiene algunos interfaces especializados para tipos básicos:

* IntSupplier
* LongSupplier
* DoubleSupplier
* BooleanSupplier

## 5. Filter
Ejemplos de Java 8 a demostrar el uso de **filter()**, **collect()**, **findAny()** y **orElse()**.
