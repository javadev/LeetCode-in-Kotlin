package g1501_1600.s1541_minimum_insertions_to_balance_a_parentheses_string

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minInsertions() {
        MatcherAssert.assertThat(Solution().minInsertions("(()))"), CoreMatchers.equalTo(1))
    }

    @Test
    fun minInsertions2() {
        MatcherAssert.assertThat(Solution().minInsertions("())"), CoreMatchers.equalTo(0))
    }

    @Test
    fun minInsertions3() {
        MatcherAssert.assertThat(Solution().minInsertions("))())("), CoreMatchers.equalTo(3))
    }
}
