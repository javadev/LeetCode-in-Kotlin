package g1501_1600.s1541_minimum_insertions_to_balance_a_parentheses_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minInsertions() {
        assertThat(Solution().minInsertions("(()))"), equalTo(1))
    }

    @Test
    fun minInsertions2() {
        assertThat(Solution().minInsertions("())"), equalTo(0))
    }

    @Test
    fun minInsertions3() {
        assertThat(Solution().minInsertions("))())("), equalTo(3))
    }
}
