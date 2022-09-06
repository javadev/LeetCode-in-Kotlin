package g0201_0300.s0268_missing_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun missingNumber() {
        assertThat(Solution().missingNumber(intArrayOf(3, 0, 1)), equalTo(2))
    }

    @Test
    fun missingNumber2() {
        assertThat(Solution().missingNumber(intArrayOf(3, 0, 1)), equalTo(2))
    }

    @Test
    fun missingNumber3() {
        assertThat(
            Solution().missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)),
            equalTo(8)
        )
    }

    @Test
    fun missingNumber4() {
        assertThat(Solution().missingNumber(intArrayOf(0)), equalTo(1))
    }
}
