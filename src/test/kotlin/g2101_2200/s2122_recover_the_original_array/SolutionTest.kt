package g2101_2200.s2122_recover_the_original_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun recoverArray() {
        assertThat(
            Solution().recoverArray(intArrayOf(2, 10, 6, 4, 8, 12)),
            equalTo(intArrayOf(3, 7, 11)),
        )
    }

    @Test
    fun recoverArray2() {
        assertThat(
            Solution().recoverArray(intArrayOf(1, 1, 3, 3)),
            equalTo(intArrayOf(2, 2)),
        )
    }

    @Test
    fun recoverArray3() {
        assertThat(Solution().recoverArray(intArrayOf(5, 435)), equalTo(intArrayOf(220)))
    }

    @Test
    fun recoverArray4() {
        assertThat(
            Solution().recoverArray(intArrayOf(1, 50, 99, 101, 150, 199)),
            equalTo(intArrayOf(51, 100, 149)),
        )
    }
}
