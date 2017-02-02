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
    fun testBinarySearch1() {


        var array = intArrayOf(1,2,3,4,5)
        var index = algs.binarySearch(array, 3)

        Assert.assertEquals(2, index)


        array = intArrayOf(1,2,3,4,5)
        index = algs.binarySearch(array, 8)

        Assert.assertEquals(2, index)
    }
}