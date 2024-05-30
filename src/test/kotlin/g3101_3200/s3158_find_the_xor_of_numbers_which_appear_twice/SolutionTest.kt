package g3101_3200.s3158_find_the_xor_of_numbers_which_appear_twice

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun duplicateNumbersXOR() {
        assertThat(Solution().duplicateNumbersXOR(intArrayOf(1, 2, 1, 3)), equalTo(1))
    }

    @Test
    fun duplicateNumbersXOR2() {
        assertThat(Solution().duplicateNumbersXOR(intArrayOf(1, 2, 3)), equalTo(0))
    }

    @Test
    fun duplicateNumbersXOR3() {
        assertThat(Solution().duplicateNumbersXOR(intArrayOf(1, 2, 2, 1)), equalTo(3))
    }
}
