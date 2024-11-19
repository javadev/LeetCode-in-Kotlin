package g2501_2600.s2546_apply_bitwise_operations_to_make_strings_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeStringsEqual() {
        assertThat(
            Solution().makeStringsEqual("1010", "0110"),
            equalTo(true),
        )
    }

    @Test
    fun makeStringsEqual2() {
        assertThat(
            Solution().makeStringsEqual("11", "00"),
            equalTo(false),
        )
    }
}
