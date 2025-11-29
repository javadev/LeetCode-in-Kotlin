package g2401_2500.s2425_bitwise_xor_of_all_pairings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun xorAllNums() {
        assertThat(
            Solution().xorAllNums(intArrayOf(2, 1, 3), intArrayOf(10, 2, 5, 0)),
            equalTo(13),
        )
    }

    @Test
    fun xorAllNums2() {
        assertThat(Solution().xorAllNums(intArrayOf(1, 2), intArrayOf(3, 4)), equalTo(0))
    }

    @Test
    fun xorAllNums3() {
        assertThat(Solution().xorAllNums(intArrayOf(7), intArrayOf(1, 2, 3)), equalTo(7))
    }

    @Test
    fun xorAllNums4() {
        assertThat(Solution().xorAllNums(intArrayOf(1, 2, 3), intArrayOf(5)), equalTo(5))
    }

    @Test
    fun xorAllNums5() {
        assertThat(Solution().xorAllNums(intArrayOf(8), intArrayOf(6)), equalTo(14))
    }

    @Test
    fun xorAllNums6() {
        assertThat(Solution().xorAllNums(intArrayOf(), intArrayOf(1, 2, 3)), equalTo(0))
    }

    @Test
    fun xorAllNums7() {
        assertThat(Solution().xorAllNums(intArrayOf(4, 5, 6), intArrayOf()), equalTo(0))
    }

    @Test
    fun xorAllNums8() {
        assertThat(Solution().xorAllNums(intArrayOf(), intArrayOf()), equalTo(0))
    }
}
