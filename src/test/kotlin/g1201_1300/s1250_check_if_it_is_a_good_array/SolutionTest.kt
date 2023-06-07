package g1201_1300.s1250_check_if_it_is_a_good_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isGoodArray() {
        assertThat(Solution().isGoodArray(intArrayOf(12, 5, 7, 23)), equalTo(true))
    }

    @Test
    fun isGoodArray2() {
        assertThat(Solution().isGoodArray(intArrayOf(29, 6, 10)), equalTo(true))
    }

    @Test
    fun isGoodArray3() {
        assertThat(Solution().isGoodArray(intArrayOf(3, 6)), equalTo(false))
    }
}
