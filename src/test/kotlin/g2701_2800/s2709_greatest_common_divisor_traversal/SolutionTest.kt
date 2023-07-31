package g2701_2800.s2709_greatest_common_divisor_traversal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canTraverseAllPairs() {
        assertThat(
            Solution().canTraverseAllPairs(intArrayOf(2, 3, 6)),
            equalTo(true)
        )
    }

    @Test
    fun canTraverseAllPairs2() {
        assertThat(
            Solution().canTraverseAllPairs(intArrayOf(3, 9, 5)),
            equalTo(false)
        )
    }

    @Test
    fun canTraverseAllPairs3() {
        assertThat(
            Solution().canTraverseAllPairs(intArrayOf(4, 3, 12, 8)),
            equalTo(true)
        )
    }
}
