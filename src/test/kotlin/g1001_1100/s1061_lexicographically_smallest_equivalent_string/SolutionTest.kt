package g1001_1100.s1061_lexicographically_smallest_equivalent_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestEquivalentString() {
        assertThat(
            Solution().smallestEquivalentString("hello", "world", "hold"),
            equalTo("hdld"),
        )
    }

    @Test
    fun smallestEquivalentString2() {
        assertThat(
            Solution().smallestEquivalentString("parker", "morris", "parser"),
            equalTo("makkek"),
        )
    }

    @Test
    fun smallestEquivalentString3() {
        assertThat(
            Solution().smallestEquivalentString("leetcode", "programs", "sourcecode"),
            equalTo("aauaaaaada"),
        )
    }
}
