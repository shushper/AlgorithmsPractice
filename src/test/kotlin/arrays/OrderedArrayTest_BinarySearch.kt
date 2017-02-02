package arrays

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by shushper on 31.01.17.
 */
class OrderedArrayTest_BinarySearch {

    lateinit var algs: OrderedArrayAlgorithms

    @Before
    fun before() {
        algs = OrderedArrayAlgorithms()
    }

    @Test
    fun testBinarySearchLafore() {
        var array = intArrayOf(1,2,3,4,5)
        var index = algs.binarySearchLafore(array, 3)

        Assert.assertEquals(2, index)


        array = intArrayOf(1,2,3,4,5)
        index = algs.binarySearchLafore(array, 8)

        Assert.assertTrue(index < 0)
    }


    @Test
    fun testBinarySearchKotlinInvoke() {


        var array = intArrayOf(1,2,3,4,5)
        var index = algs.binarySearchKotlinInvoke(array, 3)

        Assert.assertEquals(2, index)


        array = intArrayOf(1,2,3,4,5)
        index = algs.binarySearchKotlinInvoke(array, 8)

        Assert.assertTrue(index < 0)
    }
}