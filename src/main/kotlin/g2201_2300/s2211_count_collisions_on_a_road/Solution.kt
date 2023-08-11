package g2201_2300.s2211_count_collisions_on_a_road

// #Medium #String #Stack #2023_06_27_Time_325_ms_(100.00%)_Space_38.5_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Deque

class Solution {
    fun countCollisions(directions: String?): Int {
        if (directions == null || directions.length == 1) {
            return 0
        }
        val stack: Deque<Char> = ArrayDeque()
        val direction = directions.toCharArray()
        var prevc = '0'
        var collision = 0
        for (i in direction.indices) {
            if (direction[i] == 'R') {
                stack.push(direction[i])
            } else {
                if (direction[i] == 'S' && prevc == 'R') {
                    if (stack.isNotEmpty()) {
                        stack.pop()
                    }
                    collision += 1
                    direction[i] = 'S'
                    while (stack.isNotEmpty()) {
                        collision++
                        stack.pop()
                    }
                }
                if (direction[i] == 'L' && prevc == 'R') {
                    stack.pop()
                    collision += 2
                    direction[i] = 'S'
                    while (stack.isNotEmpty()) {
                        collision++
                        stack.pop()
                    }
                }
                if (direction[i] == 'L' && prevc == 'S') {
                    collision++
                    direction[i] = 'S'
                }
            }
            prevc = direction[i]
        }
        return collision
    }
}
