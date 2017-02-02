package arrays

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by shushper on 31.01.17.
 */
class ArrayTest_Shuffle {

    lateinit var algs: ArrayAlgorithms

    @Before
    fun before() {
        algs = ArrayAlgorithms()
    }

    @Test
    fun testShuffle() {
        var array = intArrayOf(1,2,3,4,5,6,7,8)

        for (i in array) {
            print("$i ")
        }

        println()

        algs.shuffle(array)

        for (i in array) {
            print("$i ")
        }

        println()
        println()

        array = intArrayOf(1,2,3)

        for (i in array) {
            print("$i ")
        }

        println()

        algs.shuffle(array)

        for (i in array) {
            print("$i ")
        }


        println()
        println()

        array = intArrayOf(1,2)

        for (i in array) {
            print("$i ")
        }

        println()

        algs.shuffle(array)

        for (i in array) {
            print("$i ")
        }

        println()
        println()

        array = intArrayOf(1)

        for (i in array) {
            print("$i ")
        }

        println()

        algs.shuffle(array)

        for (i in array) {
            print("$i ")
        }
    }
}