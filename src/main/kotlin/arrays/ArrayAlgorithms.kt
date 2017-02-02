package arrays

/**
 * Created by shushper on 31.01.17.
 */
class ArrayAlgorithms {

    fun reverse1(array: IntArray) {
        for (i in 0 until array.size / 2) {
            val temp = array[i]
            array[i] = array[array.lastIndex - i]
            array[array.lastIndex - i] = temp
        }
    }

    fun reverse2(array: IntArray) {
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

    fun reverse3(array: IntArray) {
        array.reverse()
    }
}