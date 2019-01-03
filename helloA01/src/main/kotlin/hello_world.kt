fun merge_sort(list: MutableList<String>): MutableList<String> {
    // Can't split lists anymore, so stop recursion
    val length = list.size
    if (length <= 1) return list

    // Split the list into two and recurse (divide)
    val middleIndex = length / 2
    val leftList = merge_sort(list.subList(0, middleIndex))
    val rightList = merge_sort(list.subList(middleIndex, length))

    // Merge the left and right lists (conquer)
    return merge(leftList, rightList)
}

fun merge(leftList: MutableList<String>, rightList: MutableList<String>):
        MutableList<String> {
    val result = mutableListOf<String>()
    var leftIndex = 0
    var rightIndex = 0

    while (leftIndex < leftList.size && rightIndex < rightList.size) {
        val lhs = leftList[leftIndex]
        val rhs = rightList[rightIndex]
        if (lhs < rhs) {
            result.add(lhs)
            leftIndex++
        } else {
            result.add(rhs)
            rightIndex++
        }
    }

    // Copy remaining elements of leftList (if any) into the result
    while (leftIndex < leftList.size) {
        result.add(leftList[leftIndex])
        leftIndex++
    }

    // Copy remaining elements of rightList (if any) into the result
    while (rightIndex < rightList.size) {
        result.add(rightList[rightIndex])
        rightIndex++
    }

    return result
}


fun quick_sort(list: MutableList<Int>,
               startIndex: Int = 0,
               endIndex: Int = list.size - 1) {
    if (startIndex < endIndex) {
        val pivotIndex = partition(list, startIndex, endIndex)
        quick_sort(list, startIndex, pivotIndex - 1) // Before pivot index
        quick_sort(list, pivotIndex + 1, endIndex) // After pivot index
    }
}


fun partition(list: MutableList<Int>,
              startIndex: Int = 0,
              endIndex: Int = list.size - 1): Int {
    // Element to be placed at the correct position in the list
    val pivotValue = list[endIndex]

    // Index of element smaller than pivotValue
    var smallerElementIndex = startIndex

    // Make a single pass through the list (not including endIndex)
    for (index in startIndex until endIndex) {
        // If current element is smaller than equal to pivotValue then swap it w/
        // the element at smallerElementIndex
        val valueAtIndex = list[index]
        if (valueAtIndex < pivotValue) {
            list.swap(smallerElementIndex, index)
            smallerElementIndex++
        }
    }

    // Finally move the pivotValue into the right place on the list
    list.swap(smallerElementIndex, endIndex)

    // Return the index just after where the pivot value ended up
    return smallerElementIndex
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}
fun main(args: Array<String>) {
    println("Hello World!")
    val temperature: Short = -11245
    println("$temperature")
    val list = mutableListOf("test", "crap","shit","whore")
    val intList = mutableListOf<Int>(1,9,19,29,3,1001,-3)
    val newlist = merge_sort(list)
    quick_sort(intList)
    println(list)
    println(newlist)
    println(intList)
}