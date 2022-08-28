package g0001_0100.s0048_rotate_image

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Math #Matrix
// #Data_Structure_II_Day_3_Array #Programming_Skills_II_Day_7 #Udemy_2D_Arrays/Matrix
// #2022_08_28_Time_197_ms_(89.14%)_Space_35.5_MB_(83.90%)

class Solution {
    fun rotate(matrix: Array<IntArray>) {
        val q = Queue()
        var l = 0
        var r = matrix.size - 1
        var u = 0
        var d = matrix.size - 1
        while (true) {
            if (l >= r) {
                break
            }
            q.initialize()
            for (i in l until r) {
                q.enq(matrix[u][i])
            }
            for (i in u until d) {
                q.enq(matrix[i][r])
                matrix[i][r] = q.deq()
            }
            for (i in r downTo l + 1) {
                q.enq(matrix[d][i])
                matrix[d][i] = q.deq()
            }
            for (i in d downTo u + 1) {
                q.enq(matrix[i][l])
                matrix[i][l] = q.deq()
            }
            for (i in l until r) {
                matrix[u][i] = q.deq()
            }
            l += 1
            r -= 1
            u += 1
            d -= 1
        }
    }

    class Queue {
        var queue = MutableList(0) { 0 }
        fun initialize() {
            this.queue = MutableList(0) { 0 }
        }
        fun enq(i: Int) {
            this.queue.add(i)
        }
        fun deq(): Int {
            val r = this.queue[0]
            this.queue.removeAt(0)
            return r
        }
    }
}
