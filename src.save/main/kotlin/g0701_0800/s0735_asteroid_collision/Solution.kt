package g0701_0800.s0735_asteroid_collision

// #Medium #Array #Stack #Level_2_Day_18_Stack
// #2023_03_02_Time_243_ms_(100.00%)_Space_37.9_MB_(88.46%)

import java.util.Deque
import java.util.LinkedList

class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack: Deque<Int> = LinkedList()
        for (a in asteroids) {
            if (a > 0) {
                stack.addLast(a)
            } else {
                if (!stack.isEmpty() && stack.peekLast() > 0) {
                    if (stack.peekLast() == Math.abs(a)) {
                        stack.pollLast()
                    } else {
                        while (!stack.isEmpty() && stack.peekLast() > 0 && stack.peekLast() < Math.abs(a)) {
                            stack.pollLast()
                        }
                        if (!stack.isEmpty() && stack.peekLast() > 0 && stack.peekLast() == Math.abs(a)) {
                            stack.pollLast()
                        } else if (stack.isEmpty() || stack.peekLast() < 0) {
                            stack.addLast(a)
                        }
                    }
                } else {
                    stack.addLast(a)
                }
            }
        }
        val ans = IntArray(stack.size)
        for (i in stack.indices.reversed()) {
            ans[i] = stack.pollLast()
        }
        return ans
    }
}
