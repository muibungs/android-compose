package com.me.compose.sample

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println(
        "The movie ticket price for a person aged $child is  \$${
            ticketPrice(
                child,
                isMonday
            )
        }."
    )
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println(
        "The movie ticket price for a person aged $senior is \$${
            ticketPrice(
                senior,
                isMonday
            )
        }."
    )
}

fun ticketPrice(age: Int, isMonday: Boolean): String {
    val price = when (age) {
        in 0..12 -> {
            "$15"
        }
        in 13..60 -> {
            if (isMonday) "$25" else "$30"
        }
        in 61..100 -> {
            "$20"
        }
        -1 -> {
            "invalid age"
        }
        else -> {
            "invalid age"
        }
    }
    return price
}
