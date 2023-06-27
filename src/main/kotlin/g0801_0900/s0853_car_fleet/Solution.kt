package g0801_0900.s0853_car_fleet

// #Medium #Array #Sorting #Stack #Monotonic_Stack
// #2023_03_30_Time_757_ms_(85.29%)_Space_50.7_MB_(100.00%)

class Solution {
    private class Car {
        var position = 0
        var speed = 0
    }

    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val cars: MutableList<Car> = ArrayList()
        for (i in position.indices) {
            val c = Car()
            c.position = position[i]
            c.speed = speed[i]
            cars.add(c)
        }
        cars.sortBy { it.position }
        var numFleets = 1
        var lastTime = (
            (target - cars[cars.size - 1].position).toFloat() /
                cars[cars.size - 1].speed
            )
        for (i in cars.size - 2 downTo 0) {
            val timeToTarget = (target - cars[i].position).toFloat() / cars[i].speed
            if (timeToTarget > lastTime) {
                numFleets++
                lastTime = timeToTarget
            }
        }
        return numFleets
    }
}
