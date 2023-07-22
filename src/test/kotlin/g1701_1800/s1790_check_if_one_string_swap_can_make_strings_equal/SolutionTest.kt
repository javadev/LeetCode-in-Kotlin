package g1701_1800.s1790_check_if_one_string_swap_can_make_strings_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun areAlmostEqual() {
        assertThat(Solution().areAlmostEqual("bank", "kanb"), equalTo(true))
    }

    @Test
    fun areAlmostEqual2() {
        assertThat(Solution().areAlmostEqual("attack", "defend"), equalTo(false))
    }

    @Test
    fun areAlmostEqual3() {
        assertThat(Solution().areAlmostEqual("kelb", "kelb"), equalTo(true))
    }
}
