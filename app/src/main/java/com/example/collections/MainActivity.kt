package com.example.collections


fun exampleArrays(){
    val rockPlanets = arrayOf("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    solarSystem[3] = "Little Earth"
    println(solarSystem[3])

    // solarSystem[8] = "Pluto"
    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    println(newSolarSystem[8])
}


fun exampleLists() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    println(solarSystem[2])
    // println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))

    for (planet in solarSystem) {
        println(planet)
    }
    val mutableSolarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    mutableSolarSystem.add("Pluto")
    mutableSolarSystem.add(3, "Theia")
    mutableSolarSystem[3] = "Future Moon"
    println(mutableSolarSystem[3])
    println(mutableSolarSystem[9])
    mutableSolarSystem.removeAt(9)
    mutableSolarSystem.remove("Future Moon")
    println(mutableSolarSystem.contains("Pluto"))
    println("Future Moon" in mutableSolarSystem)
}

fun exampleSets() {
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)

    solarSystem.add("Pluto")
    println(solarSystem.size)

    println(solarSystem.contains("Pluto"))

    solarSystem.add("Pluto")
    println(solarSystem.size)

    solarSystem.remove("Pluto")
    println(solarSystem.size)

    println(solarSystem.contains("Pluto"))
}


fun exampleMaps() {
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    println(solarSystem.size)

    solarSystem["Pluto"] = 5
    println(solarSystem.size)

    println(solarSystem["Pluto"])

    // println(solarSystem.get("Theia"))

    solarSystem.remove("Pluto")
    println(solarSystem.size)

    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
}


fun main(){
    exampleArrays()
    exampleLists()
    exampleSets()
    exampleMaps()
}