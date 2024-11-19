package g1001_1100.s1018_binary_prefix_divisible_by_5

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun prefixesDivBy5() {
        assertThat(
            Solution().prefixesDivBy5(intArrayOf(0, 1, 1)),
            equalTo(listOf(true, false, false)),
        )
    }

    @Test
    fun prefixesDivBy52() {
        assertThat(
            Solution().prefixesDivBy5(intArrayOf(1, 1, 1)),
            equalTo(listOf(false, false, false)),
        )
    }
}
