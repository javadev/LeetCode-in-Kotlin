package g3901_4000.s3923_minimum_generations_to_target_point

// #Medium #Array #Hash_Table #Simulation #Staff #Biweekly_Contest_182
// #2026_09_29_Time_24_ms_(100.00%)_Space_46.83_MB_(67.86%)

class Solution {
    fun minGenerations(points: Array<IntArray>, target: IntArray): Int {
        val visited = BooleanArray(TOTAL_POINTS)
        val allPoints: MutableList<Int> = ArrayList<Int>()
        var frontier: MutableList<Int> = ArrayList<Int>()
        val targetCode = encode(target[0], target[1], target[2])
        initializePoints(points, visited, allPoints, frontier)
        if (frontier.contains(targetCode)) {
            return 0
        }
        var generation = 0
        while (frontier.isNotEmpty()) {
            generation++
            val nextFrontier = generateNextFrontier(frontier, allPoints, visited)
            if (nextFrontier.contains(targetCode)) {
                return generation
            }
            addPoints(nextFrontier, visited, allPoints)
            frontier = nextFrontier
        }
        return -1
    }

    private fun initializePoints(
        points: Array<IntArray>,
        visited: BooleanArray,
        allPoints: MutableList<Int>,
        frontier: MutableList<Int>,
    ) {
        for (point in points) {
            val code = encode(point[0], point[1], point[2])
            visited[code] = true
            allPoints.add(code)
            frontier.add(code)
        }
    }

    private fun generateNextFrontier(
        frontier: MutableList<Int>,
        allPoints: MutableList<Int>,
        visited: BooleanArray,
    ): MutableList<Int> {
        val nextFrontier: MutableList<Int> = ArrayList<Int>()
        val addedThisGeneration = BooleanArray(TOTAL_POINTS)
        for (pointA in frontier) {
            addGeneratedPoints(pointA, allPoints, visited, addedThisGeneration, nextFrontier)
        }
        return nextFrontier
    }

    private fun addGeneratedPoints(
        pointA: Int,
        allPoints: MutableList<Int>,
        visited: BooleanArray,
        addedThisGeneration: BooleanArray,
        nextFrontier: MutableList<Int>,
    ) {
        val a = decode(pointA)
        for (pointB in allPoints) {
            if (pointA != pointB) {
                addGeneratedPoint(a, pointB, visited, addedThisGeneration, nextFrontier)
            }
        }
    }

    private fun addGeneratedPoint(
        a: IntArray,
        pointB: Int,
        visited: BooleanArray,
        addedThisGeneration: BooleanArray,
        nextFrontier: MutableList<Int>,
    ) {
        val b = decode(pointB)
        val x = (a[0] + b[0]) / 2
        val y = (a[1] + b[1]) / 2
        val z = (a[2] + b[2]) / 2
        val newPoint = encode(x, y, z)
        if (!visited[newPoint] && !addedThisGeneration[newPoint]) {
            addedThisGeneration[newPoint] = true
            nextFrontier.add(newPoint)
        }
    }

    private fun addPoints(points: MutableList<Int>, visited: BooleanArray, allPoints: MutableList<Int>) {
        for (point in points) {
            visited[point] = true
            allPoints.add(point)
        }
    }

    private fun encode(x: Int, y: Int, z: Int): Int = x * SIZE * SIZE + y * SIZE + z

    private fun decode(code: Int): IntArray {
        var code = code
        val x: Int = code / (SIZE * SIZE)
        code %= SIZE * SIZE
        val y: Int = code / SIZE
        val z: Int = code % SIZE
        return intArrayOf(x, y, z)
    }

    companion object {
        private const val SIZE = 7
        private const val TOTAL_POINTS: Int = SIZE * SIZE * SIZE
    }
}
