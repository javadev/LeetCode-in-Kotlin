package g0101_0200.s0155_min_stack

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Stack #Design
// #Data_Structure_II_Day_14_Stack_Queue #Programming_Skills_II_Day_18 #Level_2_Day_16_Design
// #Udemy_Design #Big_O_Time_O(1)_Space_O(N)
// #2022_09_06_Time_331_ms_(84.88%)_Space_54.3_MB_(46.34%)

class MinStack() {
    private val stack: ArrayDeque<Pair<Int, Int>> = ArrayDeque()

    fun push(x: Int) {
        val min: Int = if (stack.isEmpty()) {
            x
        } else {
            getMin()
        }
        stack.addLast(x to minOf(min, x))
    }

    fun pop() {
        stack.removeLast()
    }

    fun top(): Int {
        return stack
            .last()
            .first
    }

    fun getMin(): Int {
        return stack
            .last()
            .second
    }
}

/*
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
