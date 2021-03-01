package com.avalitov.randomer

import kotlin.random.Random



interface RandomGenerator {

    fun getNewRandom(fromNumber: Int, untilNumber: Int):Int {
        return if (fromNumber > untilNumber) -1 else Random.nextInt(fromNumber, untilNumber)
        // this is probably not what you meant, is it?
    }

}
