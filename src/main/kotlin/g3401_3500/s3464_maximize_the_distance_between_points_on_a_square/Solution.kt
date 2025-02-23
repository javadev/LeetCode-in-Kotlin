package g3401_3500.s3464_maximize_the_distance_between_points_on_a_square

// #Hard #2025_02_23_Time_159_ms_(100.00%)_Space_67.20_MB_(100.00%)

class Solution {
    fun maxDistance(sideLength: Int, points: Array<IntArray>, requiredPoints: Int): Int {
        val perimeter = 4L * sideLength
        val numPoints = points.size
        val mappedPositions = LongArray(numPoints)
        for (i in 0..<numPoints) {
            mappedPositions[i] = mapToPerimeter(sideLength, points[i][0], points[i][1])
        }
        mappedPositions.sort()
        var low: Long = 0
        var high = perimeter
        while (low < high) {
            val mid = (low + high + 1) / 2
            if (isValidDistance(mid, requiredPoints, mappedPositions, perimeter)) {
                low = mid
            } else {
                high = mid - 1
            }
        }
        return low.toInt()
    }

    private fun mapToPerimeter(sideLength: Int, x: Int, y: Int): Long {
        if (y == sideLength) {
            return x.toLong()
        }
        if (x == sideLength) {
            return sideLength + (sideLength - y).toLong()
        }
        if (y == 0) {
            return 2L * sideLength + (sideLength - x)
        }
        return 3L * sideLength + y
    }

    private fun isValidDistance(
        minDistance: Long,
        requiredPoints: Int,
        mappedPositions: LongArray,
        perimeter: Long,
    ): Boolean {
        val numPoints = mappedPositions.size
        val extendedPositions = LongArray(2 * numPoints)
        for (i in 0..<numPoints) {
            extendedPositions[i] = mappedPositions[i]
            extendedPositions[i + numPoints] = mappedPositions[i] + perimeter
        }
        for (i in 0..<numPoints) {
            if (canSelectRequiredPoints(
                    i,
                    minDistance,
                    requiredPoints,
                    mappedPositions,
                    extendedPositions,
                    perimeter,
                )
            ) {
                return true
            }
        }
        return false
    }

    private fun canSelectRequiredPoints(
        startIndex: Int,
        minDistance: Long,
        requiredPoints: Int,
        mappedPositions: LongArray,
        extendedPositions: LongArray,
        perimeter: Long,
    ): Boolean {
        var selectedCount = 1
        var previousPosition = mappedPositions[startIndex]
        var currentIndex = startIndex
        for (i in 1..<requiredPoints) {
            val targetPosition = previousPosition + minDistance
            val left = currentIndex + 1
            val right = startIndex + mappedPositions.size
            val nextIndex = lowerBound(extendedPositions, left, right, targetPosition)
            if (nextIndex >= right) {
                return false
            }
            selectedCount++
            previousPosition = extendedPositions[nextIndex]
            currentIndex = nextIndex
        }
        return selectedCount == requiredPoints &&
            (previousPosition - mappedPositions[startIndex] <= perimeter - minDistance)
    }

    private fun lowerBound(arr: LongArray, left: Int, right: Int, target: Long): Int {
        var left = left
        var right = right
        while (left < right) {
            val mid = left + (right - left) / 2
            if (arr[mid] >= target) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }
}
