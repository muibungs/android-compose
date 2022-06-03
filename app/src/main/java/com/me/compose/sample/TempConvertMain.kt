package com.me.compose.sample

fun main() {

    val celsius: (Double) -> Double = { celsius ->
        (9.0.div(5)*celsius) + 32
//        (((9 / 5)) * (celsius)) + 32
    }
    val kelvin: (Double) -> Double = { kelvin ->
        kelvin - 273.15
    }
    val fahrenheit: (Double) -> Double = { fahrenheit ->
        (5.0.div(9)) - (fahrenheit - 32) + 273.15
    }


    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsius)
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvin)
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheit)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialTemperature: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement =
        String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialTemperature is $finalMeasurement degrees $finalUnit.")
}