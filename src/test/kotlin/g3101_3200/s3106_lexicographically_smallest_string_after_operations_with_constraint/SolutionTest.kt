package g3101_3200.s3106_lexicographically_smallest_string_after_operations_with_constraint

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestString() {
        assertThat(Solution().getSmallestString("zbbz", 3), equalTo("aaaz"))
    }

    @Test
    fun smallestString2() {
        assertThat(Solution().getSmallestString("xaxcd", 4), equalTo("aawcd"))
    }

    @Test
    fun smallestString3() {
        assertThat(Solution().getSmallestString("lol", 0), equalTo("lol"))
    }
}
