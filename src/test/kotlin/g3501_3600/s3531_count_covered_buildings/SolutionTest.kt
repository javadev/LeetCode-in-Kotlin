package g3501_3600.s3531_count_covered_buildings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCoveredBuildings() {
        assertThat<Int>(
            Solution()
                .countCoveredBuildings(
                    3,
                    arrayOf<IntArray>(
                        intArrayOf(1, 2),
                        intArrayOf(2, 2),
                        intArrayOf(3, 2),
                        intArrayOf(2, 1),
                        intArrayOf(2, 3),
                    ),
                ),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countCoveredBuildings2() {
        assertThat<Int>(
            Solution()
                .countCoveredBuildings(
                    3,
                    arrayOf<IntArray>(intArrayOf(1, 1), intArrayOf(1, 2), intArrayOf(2, 1), intArrayOf(2, 2)),
                ),
            equalTo<Int>(0),
        )
    }

    @Test
    fun countCoveredBuildings3() {
        assertThat<Int>(
            Solution()
                .countCoveredBuildings(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(1, 3),
                        intArrayOf(3, 2),
                        intArrayOf(3, 3),
                        intArrayOf(3, 5),
                        intArrayOf(5, 3),
                    ),
                ),
            equalTo<Int>(1),
        )
    }
}
