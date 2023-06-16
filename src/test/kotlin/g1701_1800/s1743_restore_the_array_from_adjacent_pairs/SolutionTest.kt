package g1701_1800.s1743_restore_the_array_from_adjacent_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun restoreArray() {
        assertThat(
            Solution().restoreArray(arrayOf(intArrayOf(2, 1), intArrayOf(3, 4), intArrayOf(3, 2))),
            equalTo(intArrayOf(1, 2, 3, 4))
        )
    }

    @Test
    fun restoreArray2() {
        assertThat(
            Solution().restoreArray(arrayOf(intArrayOf(4, -2), intArrayOf(1, 4), intArrayOf(-3, 1))),
            equalTo(intArrayOf(-2, 4, 1, -3))
        )
    }

    @Test
    fun restoreArray3() {
        assertThat(
            Solution().restoreArray(arrayOf(intArrayOf(100000, -100000))),
            equalTo(intArrayOf(100000, -100000))
        )
    }
}
