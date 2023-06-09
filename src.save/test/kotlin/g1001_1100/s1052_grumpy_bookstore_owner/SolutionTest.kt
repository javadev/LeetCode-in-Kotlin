package g1001_1100.s1052_grumpy_bookstore_owner

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSatisfied() {
        assertThat(
            Solution()
                .maxSatisfied(
                    intArrayOf(1, 0, 1, 2, 1, 1, 7, 5), intArrayOf(0, 1, 0, 1, 0, 1, 0, 1),
                    3
                ),
            equalTo(16)
        )
    }

    @Test
    fun maxSatisfied2() {
        assertThat(Solution().maxSatisfied(intArrayOf(1), intArrayOf(0), 3), equalTo(1))
    }
}
