package g3201_3300.s3226_number_of_bit_changes_to_make_two_integers_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minChanges() {
        assertThat(Solution().minChanges(13, 4), equalTo(2))
    }

    @Test
    fun minChanges2() {
        assertThat(Solution().minChanges(21, 21), equalTo(0))
    }

    @Test
    fun minChanges3() {
        assertThat(Solution().minChanges(14, 13), equalTo(-1))
    }
}
