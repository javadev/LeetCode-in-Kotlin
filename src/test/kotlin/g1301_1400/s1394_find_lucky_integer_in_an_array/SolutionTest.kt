package g1301_1400.s1394_find_lucky_integer_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLucky() {
        assertThat(Solution().findLucky(intArrayOf(2, 2, 3, 4)), equalTo(2))
    }

    @Test
    fun findLucky2() {
        assertThat(Solution().findLucky(intArrayOf(1, 2, 2, 3, 3, 3)), equalTo(3))
    }

    @Test
    fun findLucky3() {
        assertThat(Solution().findLucky(intArrayOf(2, 2, 2, 3, 3)), equalTo(-1))
    }
}
