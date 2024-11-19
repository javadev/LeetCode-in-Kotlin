package g0401_0500.s0455_assign_cookies

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findContentChildren() {
        assertThat(
            Solution().findContentChildren(intArrayOf(1, 2, 3), intArrayOf(1, 1)),
            equalTo(1),
        )
    }

    @Test
    fun findContentChildren2() {
        assertThat(
            Solution()
                .findContentChildren(
                    intArrayOf(
                        1,
                        2,
                    ),
                    intArrayOf(1, 2, 3),
                ),
            equalTo(2),
        )
    }
}
