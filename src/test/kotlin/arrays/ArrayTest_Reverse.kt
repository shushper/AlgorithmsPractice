package arrays

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by shushper on 31.01.17.
 */
class ArrayTest_Reverse {

    lateinit var reverse: ArrayAlgorithms

    @Before
    fun before() {
        reverse = ArrayAlgorithms()
    }

    @Test
    fun testReverse1() {
        var array = intArrayOf(1,2,3,4,5)

        reverse.reverse1(array)

        Assert.assertArrayEquals(intArrayOf(5,4,3,2,1), array)


        array = intArrayOf(1,2,3,4,5,6)

        reverse.reverse1(array)

        Assert.assertArrayEquals(intArrayOf(6, 5,4,3,2,1), array)


        array = intArrayOf(1,2)

        reverse.reverse1(array)

        Assert.assertArrayEquals(intArrayOf(2,1), array)


        array = intArrayOf(1)

        reverse.reverse1(array)

        Assert.assertArrayEquals(intArrayOf(1), array)
    }

    @Test
    fun testReverse2() {
        var array = intArrayOf(1,2,3,4,5)

        reverse.reverse2(array)

        Assert.assertArrayEquals(intArrayOf(5,4,3,2,1), array)


        array = intArrayOf(1,2,3,4,5,6)

        reverse.reverse2(array)

        Assert.assertArrayEquals(intArrayOf(6, 5,4,3,2,1), array)


        array = intArrayOf(1,2)

        reverse.reverse2(array)

        Assert.assertArrayEquals(intArrayOf(2,1), array)


        array = intArrayOf(1)

        reverse.reverse2(array)

        Assert.assertArrayEquals(intArrayOf(1), array)
    }


    @Test
    fun testReverse3() {
        var array = intArrayOf(1,2,3,4,5)

        reverse.reverse3(array)

        Assert.assertArrayEquals(intArrayOf(5,4,3,2,1), array)


        array = intArrayOf(1,2,3,4,5,6)

        reverse.reverse3(array)

        Assert.assertArrayEquals(intArrayOf(6, 5,4,3,2,1), array)


        array = intArrayOf(1,2)

        reverse.reverse3(array)

        Assert.assertArrayEquals(intArrayOf(2,1), array)


        array = intArrayOf(1)

        reverse.reverse3(array)

        Assert.assertArrayEquals(intArrayOf(1), array)
    }
}