package g3701_3800.s3750_minimum_number_of_flips_to_reverse_binary_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumFlips() {
        assertThat<Int>(Solution().minimumFlips(7), equalTo<Int>(0))
    }

    @Test
    fun minimumFlips2() {
        assertThat<Int>(Solution().minimumFlips(10), equalTo<Int>(4))
    }
}
