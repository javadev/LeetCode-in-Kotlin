package g0701_0800.s0717_1_bit_and_2_bit_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isOneBitCharacter() {
        assertThat(Solution().isOneBitCharacter(intArrayOf(1, 0, 0)), equalTo(true))
    }

    @Test
    fun isOneBitCharacter2() {
        assertThat(Solution().isOneBitCharacter(intArrayOf(1, 1, 1, 0)), equalTo(false))
    }
}
