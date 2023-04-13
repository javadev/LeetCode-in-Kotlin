package g0801_0900.s0900_rle_iterator

// #Medium #Array #Design #Counting #Iterator
// #2023_04_13_Time_175_ms_(83.33%)_Space_36.2_MB_(83.33%)

@Suppress("NAME_SHADOWING")
class RLEIterator(private val array: IntArray) {
    private var index = 0
    fun next(n: Int): Int {
        var n = n
        var lastElement = -1
        while (n > 0 && index < array.size) {
            if (array[index] > n) {
                array[index] -= n
                lastElement = array[index + 1]
                break
            } else if (array[index] == n) {
                array[index] = 0
                lastElement = array[index + 1]
                index += 2
                break
            } else {
                n -= array[index]
                index += 2
            }
        }
        return lastElement
    }
}

/*
 * Your RLEIterator object will be instantiated and called as such:
 * var obj = RLEIterator(encoding)
 * var param_1 = obj.next(n)
 */
