package arrays

import java.util.*

/**
 * Created by shushper on 31.01.17.
 */
class ArrayAlgorithms {

    fun reverse(array: IntArray) {
        for (i in 0 until array.size / 2) {
            val temp = array[i]
            array[i] = array[array.lastIndex - i]
            array[array.lastIndex - i] = temp
        }
    }

    fun reverseKotlin(array: IntArray) {
        val midPoint = (array.size / 2) - 1
        if (midPoint < 0) return

        var reverseIndex = array.lastIndex

        for (i in 0..midPoint) {
            val tmp = array[i]
            array[i] = array[reverseIndex]
            array[reverseIndex] = tmp
            reverseIndex--
        }
    }

    fun reverseKotlinInvoke(array: IntArray)  {
        array.reverse()
    }


    fun shuffle(array: IntArray) : Unit {

        val random = Random()

        for (i in array.lastIndex downTo 0) {
            val randomIndex = random.nextInt(i + 1)
            val tmp = array[i]
            array[i] = array[randomIndex]
            array[randomIndex] = tmp
        }
    }
}