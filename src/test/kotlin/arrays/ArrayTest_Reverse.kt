package arrays

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by shushper on 31.01.17.
 */
class ArrayTest_Reverse {

    lateinit var algs: ArrayAlgorithms

    @Before
    fun before() {
        algs = ArrayAlgorithms()
    }

    @Test
    fun testReverse1() {
        var array = intArrayOf(1,2,3,4,5)

        algs.reverse(array)

        Assert.assertArrayEquals(intArrayOf(5,4,3,2,1), array)


        array = intArrayOf(1,2,3,4,5,6)

        algs.reverse(array)

        Assert.assertArrayEquals(intArrayOf(6, 5,4,3,2,1), array)


        array = intArrayOf(1,2)

        algs.reverse(array)

        Assert.assertArrayEquals(intArrayOf(2,1), array)


        array = intArrayOf(1)

        algs.reverse(array)

        Assert.assertArrayEquals(intArrayOf(1), array)
    }

    @Test
    fun testReverse2() {
        var array = intArrayOf(1,2,3,4,5)

        algs.reverseKotlin(array)

        Assert.assertArrayEquals(intArrayOf(5,4,3,2,1), array)


        array = intArrayOf(1,2,3,4,5,6)

        algs.reverseKotlin(array)

        Assert.assertArrayEquals(intArrayOf(6, 5,4,3,2,1), array)


        array = intArrayOf(1,2)

        algs.reverseKotlin(array)

        Assert.assertArrayEquals(intArrayOf(2,1), array)


        array = intArrayOf(1)

        algs.reverseKotlin(array)

        Assert.assertArrayEquals(intArrayOf(1), array)
    }


    @Test
    fun testReverse3() {
        var array = intArrayOf(1,2,3,4,5)

        algs.reverseKotlinInvoke(array)

        Assert.assertArrayEquals(intArrayOf(5,4,3,2,1), array)


        array = intArrayOf(1,2,3,4,5,6)

        algs.reverseKotlinInvoke(array)

        Assert.assertArrayEquals(intArrayOf(6, 5,4,3,2,1), array)


        array = intArrayOf(1,2)

        algs.reverseKotlinInvoke(array)

        Assert.assertArrayEquals(intArrayOf(2,1), array)


        array = intArrayOf(1)

        algs.reverseKotlinInvoke(array)

        Assert.assertArrayEquals(intArrayOf(1), array)
    }
}