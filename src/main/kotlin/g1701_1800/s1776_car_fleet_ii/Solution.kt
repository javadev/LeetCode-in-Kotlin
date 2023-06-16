package g1701_1800.s1776_car_fleet_ii

import java.util.Deque
import java.util.LinkedList

// #Hard #Array #Math #Stack #Heap_Priority_Queue #Monotonic_Stack
class Solution {
    fun getCollisionTimes(cars: Array<IntArray>): DoubleArray {
        val stack: Deque<Int> = LinkedList()
        val n = cars.size
        val ans = DoubleArray(n)
        for (i in n - 1 downTo 0) {
            ans[i] = -1.0
            val presentCar = cars[i]
            val presentCarSpeed = presentCar[1]
            while (stack.isNotEmpty()) {
                val previousCar = stack.peekLast()
                val previousCarSpeed = cars[previousCar][1]
                if (presentCarSpeed > previousCarSpeed &&
                    (
                        ans[previousCar] == -1.0 ||
                            catchTime(cars, i, previousCar) <= ans[previousCar]
                        )
                ) {
                    ans[i] = catchTime(cars, i, previousCar)
                    break
                }
                stack.pollLast()
            }
            stack.offerLast(i)
        }
        return ans
    }

    private fun catchTime(cars: Array<IntArray>, presentCar: Int, previousCar: Int): Double {
        val dist = cars[previousCar][0] - cars[presentCar][0]
        val speed = cars[presentCar][1] - cars[previousCar][1]
        return 1.0 * dist / speed
    }
}
