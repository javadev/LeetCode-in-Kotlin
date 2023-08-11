package g0901_1000.s0960_delete_columns_to_make_sorted_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDeletionSize() {
        assertThat(Solution().minDeletionSize(arrayOf("babca", "bbazb")), equalTo(3))
    }

    @Test
    fun minDeletionSize2() {
        assertThat(Solution().minDeletionSize(arrayOf("edcba")), equalTo(4))
    }

    @Test
    fun minDeletionSize3() {
        assertThat(Solution().minDeletionSize(arrayOf("ghi", "def", "abc")), equalTo(0))
    }
}
