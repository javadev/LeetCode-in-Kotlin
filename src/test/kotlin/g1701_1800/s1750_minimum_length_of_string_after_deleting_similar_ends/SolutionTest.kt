package g1701_1800.s1750_minimum_length_of_string_after_deleting_similar_ends

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumLength() {
        assertThat(Solution().minimumLength("ca"), equalTo(2))
    }

    @Test
    fun minimumLength2() {
        assertThat(Solution().minimumLength("cabaabac"), equalTo(0))
    }

    @Test
    fun minimumLength3() {
        assertThat(Solution().minimumLength("aabccabba"), equalTo(3))
    }
}
