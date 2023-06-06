package g1301_1400.s1363_largest_multiple_of_three

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestMultipleOfThree() {
        assertThat(Solution().largestMultipleOfThree(intArrayOf(8, 1, 9)), equalTo("981"))
    }

    @Test
    fun largestMultipleOfThree2() {
        assertThat(
            Solution().largestMultipleOfThree(intArrayOf(8, 6, 7, 1, 0)), equalTo("8760")
        )
    }

    @Test
    fun largestMultipleOfThree3() {
        assertThat(Solution().largestMultipleOfThree(intArrayOf(1)), equalTo(""))
    }
}
