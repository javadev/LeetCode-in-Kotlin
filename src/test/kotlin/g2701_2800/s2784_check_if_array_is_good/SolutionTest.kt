package g2701_2800.s2784_check_if_array_is_good

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isGood() {
        assertThat(Solution().isGood(intArrayOf(2, 1, 3)), equalTo(false))
    }

    @Test
    fun isGood2() {
        assertThat(Solution().isGood(intArrayOf(1, 3, 3, 2)), equalTo(true))
    }

    @Test
    fun isGood3() {
        assertThat(Solution().isGood(intArrayOf(1, 1)), equalTo(true))
    }

    @Test
    fun isGood4() {
        assertThat(Solution().isGood(intArrayOf(3, 4, 4, 1, 2, 1)), equalTo(false))
    }
}
