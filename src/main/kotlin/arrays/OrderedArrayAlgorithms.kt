package arrays

/**
 * Created by shushper on 31.01.17.
 */


class OrderedArrayAlgorithms {

    fun binarySearchLafore(array: IntArray, searchValue: Int): Int {
        var lowerBound = 0
        var upperBound = array.lastIndex
        var curIn: Int

        while (true) {
            curIn = (lowerBound + upperBound) / 2

            if (array[curIn] == searchValue) {
                return curIn
            } else if (lowerBound > upperBound) {
                return -1
            } else {
                if (array[curIn] < searchValue) {
                    lowerBound = curIn + 1
                } else {
                    upperBound = curIn - 1
                }
            }
        }
    }

    fun binarySearchKotlin(array: IntArray, searchValue: Int): Int {
        var low = 0
        var high = array.lastIndex

        while (low <= high) {
            val mid = (low + high).ushr(1)
            val midVal = array[mid]

            if (midVal < searchValue) {
                low = mid + 1
            } else if (midVal > searchValue) {
                high = mid - 1
            } else {
                return mid
            }
        }

        return -1
    }

    fun binarySearchKotlinInvoke(array: IntArray, value: Int): Int {
        return array.binarySearch(value)
    }





}