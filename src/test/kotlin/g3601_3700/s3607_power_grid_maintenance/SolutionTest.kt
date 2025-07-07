package g3601_3700.s3607_power_grid_maintenance

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun processQueries() {
        assertThat<IntArray>(
            Solution()
                .processQueries(
                    5,
                    arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5)),
                    arrayOf<IntArray>(
                        intArrayOf(1, 3),
                        intArrayOf(2, 1),
                        intArrayOf(1, 1),
                        intArrayOf(2, 2),
                        intArrayOf(1, 2),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(3, 2, 3)),
        )
    }

    @Test
    fun processQueries2() {
        assertThat<IntArray>(
            Solution()
                .processQueries(
                    3,
                    arrayOf<IntArray>(),
                    arrayOf<IntArray>(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(1, 1)),
                ),
            equalTo<IntArray>(intArrayOf(1, -1)),
        )
    }
}
