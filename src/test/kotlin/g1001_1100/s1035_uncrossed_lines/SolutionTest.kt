package g1001_1100.s1035_uncrossed_lines

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxUncrossedLines() {
        assertThat(
            Solution().maxUncrossedLines(intArrayOf(1, 4, 2), intArrayOf(1, 2, 4)),
            equalTo(2),
        )
    }

    @Test
    fun maxUncrossedLines2() {
        assertThat(
            Solution()
                .maxUncrossedLines(intArrayOf(2, 5, 1, 2, 5), intArrayOf(10, 5, 2, 1, 5, 2)),
            equalTo(3),
        )
    }

    @Test
    fun maxUncrossedLines3() {
        assertThat(
            Solution()
                .maxUncrossedLines(intArrayOf(1, 3, 7, 1, 7, 5), intArrayOf(1, 9, 2, 5, 1)),
            equalTo(2),
        )
    }
}
