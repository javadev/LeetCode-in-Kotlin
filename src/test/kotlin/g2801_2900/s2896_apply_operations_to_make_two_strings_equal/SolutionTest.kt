package g2801_2900.s2896_apply_operations_to_make_two_strings_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations("1100011000", "0101001010", 2), equalTo(4))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations("10110", "00011", 4), equalTo(-1))
    }
}
