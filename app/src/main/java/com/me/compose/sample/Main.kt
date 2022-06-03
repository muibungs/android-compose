package com.me.compose.sample

fun main() {
//    val trickFunction = ::trick
//    trick()
//    trickFunction()
//    treat()
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }
    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

//    val treatFunction = trickOrTreat(false, coins)
    val treatFunction = trickOrTreat(false) { "$it quarters" }
//    val trickFunction = trickOrTreat(true, cupcake)
    val trickFunction = trickOrTreat(true, null)
//    treatFunction()
    repeat(4) {
        treatFunction()
    }
    trickFunction()

}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        println(extraTreat?.let { it(5) })
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}
