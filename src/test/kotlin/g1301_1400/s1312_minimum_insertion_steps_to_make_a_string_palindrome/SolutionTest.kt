package g1301_1400.s1312_minimum_insertion_steps_to_make_a_string_palindrome

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minInsertions() {
        assertThat(Solution().minInsertions("zzazz"), equalTo(0))
    }

    @Test
    fun minInsertions2() {
        assertThat(Solution().minInsertions("mbadm"), equalTo(2))
    }

    @Test
    fun minInsertions3() {
        assertThat(Solution().minInsertions("leetcode"), equalTo(5))
    }
}
