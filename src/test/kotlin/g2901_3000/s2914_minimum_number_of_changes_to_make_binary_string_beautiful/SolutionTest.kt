package g2901_3000.s2914_minimum_number_of_changes_to_make_binary_string_beautiful

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minChanges() {
        assertThat(Solution().minChanges("1001"), equalTo(2))
    }

    @Test
    fun minChanges2() {
        assertThat(Solution().minChanges("10"), equalTo(1))
    }

    @Test
    fun minChanges3() {
        assertThat(Solution().minChanges("0000"), equalTo(0))
    }
}
