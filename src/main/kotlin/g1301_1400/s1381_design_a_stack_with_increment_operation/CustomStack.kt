package g1301_1400.s1381_design_a_stack_with_increment_operation

// #Medium #Array #Stack #Design
class CustomStack(private val maxSize: Int) {
    private var top = 0
    private val stack: IntArray

    init {
        stack = IntArray(maxSize)
    }

    fun push(x: Int) {
        if (top == maxSize) {
            return
        }
        stack[top] = x
        top++
    }

    fun pop(): Int {
        if (top == 0) {
            return -1
        }
        val popValue = stack[top - 1]
        stack[top - 1] = 0
        top--
        return popValue
    }

    fun increment(k: Int, `val`: Int) {
        if (top == 0 || k == 0) {
            return
        }
        for (i in 0 until k) {
            if (i == top) {
                break
            }
            stack[i] += `val`
        }
    }
}
