package g1901_2000.s1991_find_the_middle_index_in_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMiddleIndex() {
        assertThat(Solution().findMiddleIndex(intArrayOf(2, 3, -1, 8, 4)), equalTo(3))
    }

    @Test
    fun findMiddleIndex2() {
        assertThat(Solution().findMiddleIndex(intArrayOf(1, -1, 4)), equalTo(2))
    }

    @Test
    fun findMiddleIndex3() {
        assertThat(Solution().findMiddleIndex(intArrayOf(2, 5)), equalTo(-1))
    }
}
