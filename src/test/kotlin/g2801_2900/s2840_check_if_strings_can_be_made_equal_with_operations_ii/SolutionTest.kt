package g2801_2900.s2840_check_if_strings_can_be_made_equal_with_operations_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkStrings() {
        assertThat(Solution().checkStrings("abcdba", "cabdab"), equalTo(true))
    }

    @Test
    fun checkStrings2() {
        assertThat(Solution().checkStrings("abe", "bea"), equalTo(false))
    }
}
