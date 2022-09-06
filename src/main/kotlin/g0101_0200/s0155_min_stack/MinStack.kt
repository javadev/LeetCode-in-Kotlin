package g0101_0200.s0155_min_stack

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Stack #Design
// #Data_Structure_II_Day_14_Stack_Queue #Programming_Skills_II_Day_18 #Level_2_Day_16_Design
// #Udemy_Design #2022_09_06_Time_331_ms_(84.88%)_Space_54.3_MB_(46.34%)

import java.util.Stack

class MinStack() {
    private val stack: Stack<Pair<Int, Int>> = Stack()

    fun push(x: Int) {
        val min: Int = if (stack.isEmpty()) x
        else getMin()

        stack.push(x to minOf(min, x))
    }

    fun pop() {
        stack.pop()
    }

    fun top(): Int {
        return stack
            .peek()
            .first
    }

    fun getMin(): Int {
        return stack
            .peek()
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
