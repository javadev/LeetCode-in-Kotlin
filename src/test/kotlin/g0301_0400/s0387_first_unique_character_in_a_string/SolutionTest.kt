package g0301_0400.s0387_first_unique_character_in_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun firstUniqChar() {
        assertThat(Solution().firstUniqChar("leetcode"), equalTo(0))
    }

    @Test
    fun firstUniqChar2() {
        assertThat(Solution().firstUniqChar("loveleetcode"), equalTo(2))
    }

    @Test
    fun firstUniqChar3() {
        assertThat(Solution().firstUniqChar("aabb"), equalTo(-1))
    }
}
