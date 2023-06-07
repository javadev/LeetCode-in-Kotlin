package g1401_1500.s1449_form_largest_integer_with_digits_that_add_up_to_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestNumber() {
        assertThat(
            Solution().largestNumber(intArrayOf(4, 3, 2, 5, 6, 7, 2, 5, 5), 9),
            equalTo("7772")
        )
    }

    @Test
    fun largestNumber2() {
        assertThat(
            Solution().largestNumber(intArrayOf(7, 6, 5, 5, 5, 6, 8, 7, 8), 12),
            equalTo("85")
        )
    }

    @Test
    fun largestNumber3() {
        assertThat(
            Solution().largestNumber(intArrayOf(2, 4, 6, 2, 4, 6, 4, 4, 4), 5),
            equalTo("0")
        )
    }
}
