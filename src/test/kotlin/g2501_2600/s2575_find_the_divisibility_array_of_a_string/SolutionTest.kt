package g2501_2600.s2575_find_the_divisibility_array_of_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun divisibilityArray() {
        assertThat(
            Solution().divisibilityArray("998244353", 3),
            equalTo(intArrayOf(1, 1, 0, 0, 0, 1, 1, 0, 0)),
        )
    }

    @Test
    fun divisibilityArray2() {
        assertThat(
            Solution().divisibilityArray("1010", 10),
            equalTo(intArrayOf(0, 1, 0, 1)),
        )
    }
}
