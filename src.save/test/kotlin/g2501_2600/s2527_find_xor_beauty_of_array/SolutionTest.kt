package g2501_2600.s2527_find_xor_beauty_of_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun xorBeauty() {
        assertThat(Solution().xorBeauty(intArrayOf(1, 4)), equalTo(5))
    }

    @Test
    fun xorBeauty2() {
        assertThat(
            Solution().xorBeauty(intArrayOf(15, 45, 20, 2, 34, 35, 5, 44, 32, 30)),
            equalTo(34)
        )
    }
}
