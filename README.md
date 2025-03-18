# Teste ZRP - PokeAPI

## Description

This project is a tech interview from a ZRP application. 

This api only fetch a pokemon from the pokedex api and return for the client a sorted list of abilities of the pokemon

## Route
``GET - /pokemon/{pokemonName}``

expected return

```
{
    data: ["string", "string"],
    timestamp: "2025-03-17T22:00:00"
}
```

if some error occurs a controller advice must return to a client this body

```
{
    message: "error explanation",
    timestamp: "2025-03-17T22:00:00"
}
```

<hr />

``GET - /swagger-ui/index.html``

Link to swagger documentation

<hr />

``GET - /actuator``

List of actuators available


## Build on docker

to build the project, run ``./mvnw package && java -jar target/demo-0.0.1-SNAPSHOT.jar``
and now run the ``docker build .``