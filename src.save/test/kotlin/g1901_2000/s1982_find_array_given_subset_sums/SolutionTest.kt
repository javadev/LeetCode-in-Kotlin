package g1901_2000.s1982_find_array_given_subset_sums

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun recoverArray() {
        assertThat(
            Solution().recoverArray(3, intArrayOf(-3, -2, -1, 0, 0, 1, 2, 3)),
            equalTo(intArrayOf(1, 2, -3))
        )
    }

    @Test
    fun recoverArray2() {
        assertThat(
            Solution().recoverArray(2, intArrayOf(0, 0, 0, 0)), equalTo(intArrayOf(0, 0))
        )
    }

    @Test
    fun recoverArray3() {
        assertThat(
            Solution()
                .recoverArray(
                    4, intArrayOf(0, 0, 5, 5, 4, -1, 4, 9, 9, -1, 4, 3, 4, 8, 3, 8)
                ),
            equalTo(intArrayOf(0, -1, 4, 5))
        )
    }
}
