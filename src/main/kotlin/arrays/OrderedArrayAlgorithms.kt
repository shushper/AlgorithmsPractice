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

    fun binarySearchKotlinInvoke(array: IntArray, value: Int): Int {
        return array.binarySearch(value)
    }



}