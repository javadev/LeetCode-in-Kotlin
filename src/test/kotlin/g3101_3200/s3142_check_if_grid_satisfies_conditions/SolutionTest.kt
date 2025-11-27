package g3101_3200.s3142_check_if_grid_satisfies_conditions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun satisfiesConditions() {
        assertThat(
            Solution().satisfiesConditions(arrayOf(intArrayOf(1, 0, 2), intArrayOf(1, 0, 2))),
            equalTo(true),
        )
    }

    @Test
    fun satisfiesConditions2() {
        assertThat(
            Solution().satisfiesConditions(arrayOf(intArrayOf(1, 1, 1), intArrayOf(0, 0, 0))),
            equalTo(false),
        )
    }

    @Test
    fun satisfiesConditions3() {
        assertThat(Solution().satisfiesConditions(arrayOf(intArrayOf(1), intArrayOf(2), intArrayOf(3))), equalTo(false))
    }

    @Test
    fun satisfiesConditions4() {
        assertThat(Solution().satisfiesConditions(arrayOf(intArrayOf(1), intArrayOf(1))), equalTo(true))
    }

    @Test
    fun satisfiesConditions5() {
        assertThat(Solution().satisfiesConditions(arrayOf(intArrayOf(1, 2, 3))), equalTo(true))
    }

    @Test
    fun satisfiesConditions6() {
        assertThat(Solution().satisfiesConditions(arrayOf(intArrayOf(1, 1))), equalTo(false))
    }

    @Test
    fun satisfiesConditions7() {
        assertThat(
            Solution().satisfiesConditions(arrayOf(intArrayOf(1, 2, 2), intArrayOf(3, 4, 5))),
            equalTo(false),
        )
    }

    @Test
    fun satisfiesConditions8() {
        val grid = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 0, 1),
        )
        assertThat(Solution().satisfiesConditions(grid), equalTo(false))
    }

    @Test
    fun satisfiesConditions9() {
        assertThat(Solution().satisfiesConditions(arrayOf(intArrayOf(5, 1), intArrayOf(5, 0))), equalTo(true))
    }

    @Test
    fun satisfiesConditions10() {
        assertThat(
            Solution().satisfiesConditions(arrayOf(intArrayOf(1, 0), intArrayOf(2, 2))),
            equalTo(false),
        )
    }

    @Test
    fun satisfiesConditions11() {
        assertThat(Solution().satisfiesConditions(arrayOf(intArrayOf(7))), equalTo(true))
    }

    @Test
    fun satisfiesConditions12() {
        val grid = arrayOf(
            intArrayOf(4, 1, 5, 2),
            intArrayOf(3, 0, 4, 1),
        )
        assertThat(Solution().satisfiesConditions(grid), equalTo(false))
    }

    @Test
    fun satisfiesConditions13() {
        val grid = arrayOf(
            intArrayOf(2, 3, 3, 1),
            intArrayOf(1, 0, 4, 2),
        )
        assertThat(Solution().satisfiesConditions(grid), equalTo(false))
    }
}
