package g2501_2600.s2573_find_the_string_with_lcp

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findTheString() {
        assertThat(
            Solution().findTheString(
                arrayOf(
                    intArrayOf(4, 0, 2, 0), intArrayOf(0, 3, 0, 1),
                    intArrayOf(2, 0, 2, 0), intArrayOf(0, 1, 0, 1)
                )
            ),
            equalTo("abab")
        )
    }

    @Test
    fun findTheString2() {
        assertThat(
            Solution().findTheString(
                arrayOf(
                    intArrayOf(4, 3, 2, 1), intArrayOf(3, 3, 2, 1),
                    intArrayOf(2, 2, 2, 1), intArrayOf(1, 1, 1, 1)
                )
            ),
            equalTo("aaaa")
        )
    }

    @Test
    fun findTheString3() {
        assertThat(
            Solution().findTheString(
                arrayOf(
                    intArrayOf(4, 3, 2, 1), intArrayOf(3, 3, 2, 1),
                    intArrayOf(2, 2, 2, 1), intArrayOf(1, 1, 1, 3)
                )
            ),
            equalTo("")
        )
    }
}
