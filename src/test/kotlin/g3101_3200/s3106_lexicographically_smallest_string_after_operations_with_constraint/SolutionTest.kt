package g3101_3200.s3106_lexicographically_smallest_string_after_operations_with_constraint

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestString() {
        MatcherAssert.assertThat(Solution().getSmallestString("zbbz", 3), CoreMatchers.equalTo("aaaz"))
    }

    @Test
    fun smallestString2() {
        MatcherAssert.assertThat(Solution().getSmallestString("xaxcd", 4), CoreMatchers.equalTo("aawcd"))
    }

    @Test
    fun smallestString3() {
        MatcherAssert.assertThat(Solution().getSmallestString("lol", 0), CoreMatchers.equalTo("lol"))
    }
}
