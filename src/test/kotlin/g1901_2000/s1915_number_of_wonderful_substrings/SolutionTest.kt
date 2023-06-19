package g1901_2000.s1915_number_of_wonderful_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun wonderfulSubstrings() {
        assertThat(Solution().wonderfulSubstrings("aba"), equalTo(4L))
    }

    @Test
    fun wonderfulSubstrings2() {
        assertThat(Solution().wonderfulSubstrings("aabb"), equalTo(9L))
    }

    @Test
    fun wonderfulSubstrings3() {
        assertThat(Solution().wonderfulSubstrings("he"), equalTo(2L))
    }
}
