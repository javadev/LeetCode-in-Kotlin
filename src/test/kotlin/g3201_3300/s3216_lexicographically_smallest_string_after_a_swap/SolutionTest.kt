package g3201_3300.s3216_lexicographically_smallest_string_after_a_swap

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestString() {
        assertThat(Solution().getSmallestString("45320"), equalTo("43520"))
    }

    @Test
    fun smallestString2() {
        assertThat(Solution().getSmallestString("001"), equalTo("001"))
    }
}
