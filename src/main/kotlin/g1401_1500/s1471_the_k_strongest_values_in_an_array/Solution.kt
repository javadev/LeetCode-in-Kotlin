package g1401_1500.s1471_the_k_strongest_values_in_an_array

// #Medium #Array #Sorting #Two_Pointers
class Solution {
    fun getStrongest(arr: IntArray, k: Int): IntArray {
        arr.sort()
        val array = IntArray(k)
        val median = arr[(arr.size - 1) / 2]
        var start = 0
        var end = arr.size - 1
        for (i in 0 until k) {
            if (Math.abs(arr[end] - median) >= Math.abs(arr[start] - median)) {
                array[i] = arr[end]
                end -= 1
            } else {
                array[i] = arr[start]
                start += 1
            }
        }
        return array
    }
}
