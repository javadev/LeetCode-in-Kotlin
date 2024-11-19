package g0901_1000.s0936_stamping_the_sequence

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun movesToStamp() {
        assertThat(
            CommonUtils.compareArray(
                Solution().movesToStamp("abc", "ababc"),
                intArrayOf(0, 2),
            ),
            equalTo(true),
        )
    }

    @Test
    fun movesToStamp2() {
        assertThat(
            CommonUtils.compareArray(
                Solution().movesToStamp("abca", "aabcaca"),
                intArrayOf(3, 0, 1),
            ),
            equalTo(true),
        )
    }
}
