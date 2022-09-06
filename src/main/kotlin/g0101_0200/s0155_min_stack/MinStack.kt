package g0101_0200.s0155_min_stack

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Stack #Design
// #Data_Structure_II_Day_14_Stack_Queue #Programming_Skills_II_Day_18 #Level_2_Day_16_Design
// #Udemy_Design #2022_09_06_Time_398_ms_(66.83%)_Space_51.4_MB_(67.32%)

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
