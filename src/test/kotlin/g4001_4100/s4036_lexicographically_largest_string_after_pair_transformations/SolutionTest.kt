package g4001_4100.s4036_lexicographically_largest_string_after_pair_transformations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestString() {
        assertThat<Array<String>>(
            Solution().largestString(intArrayOf(1, 3, 0)),
            equalTo<Array<String>>(arrayOf<String>("a", "ba", "")),
        )
    }

    @Test
    fun largestString2() {
        assertThat<Array<String>>(
            Solution().largestString(intArrayOf((1 shl 25) or 1)),
            equalTo<Array<String>>(arrayOf<String>("za")),
        )
    }
}
