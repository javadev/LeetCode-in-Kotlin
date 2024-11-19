package g0901_1000.s0943_find_the_shortest_superstring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestSuperstring() {
        assertThat(
            Solution().shortestSuperstring(arrayOf("alex", "loves", "leetcode")),
            equalTo("alexlovesleetcode"),
        )
    }

    @Test
    fun shortestSuperstring2() {
        assertThat(
            Solution()
                .shortestSuperstring(arrayOf("catg", "ctaagt", "gcta", "ttca", "atgcatc")),
            equalTo("gctaagttcatgcatc"),
        )
    }
}
