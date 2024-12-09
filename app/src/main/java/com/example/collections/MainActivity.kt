package com.example.collections

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.collections.ui.theme.CollectionsTheme

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


fun main(){
    exampleArrays()
    exampleLists()
    exampleSets()
}