package g0901_1000.s0944_delete_columns_to_make_sorted

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDeletionSize() {
        assertThat(Solution().minDeletionSize(arrayOf("cba", "daf", "ghi")), equalTo(1))
    }

    @Test
    fun minDeletionSize2() {
        assertThat(Solution().minDeletionSize(arrayOf("a", "b")), equalTo(0))
    }

    @Test
    fun minDeletionSize3() {
        assertThat(Solution().minDeletionSize(arrayOf("zyx", "wvu", "tsr")), equalTo(3))
    }
}
