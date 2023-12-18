package g2801_2900.s2839_check_if_strings_can_be_made_equal_with_operations_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canBeEqual() {
        assertThat(Solution().canBeEqual("abcd", "cdab"), equalTo(true))
    }

    @Test
    fun canBeEqual2() {
        assertThat(Solution().canBeEqual("abcd", "cdab"), equalTo(true))
    }
}
