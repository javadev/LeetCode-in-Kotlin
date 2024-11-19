package g1901_2000.s1985_find_the_kth_largest_integer_in_the_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthLargestNumber() {
        assertThat(
            Solution().kthLargestNumber(arrayOf("3", "6", "7", "10"), 4),
            equalTo("3"),
        )
    }

    @Test
    fun kthLargestNumber2() {
        assertThat(
            Solution().kthLargestNumber(arrayOf("2", "21", "12", "1"), 3),
            equalTo("2"),
        )
    }

    @Test
    fun kthLargestNumber3() {
        assertThat(Solution().kthLargestNumber(arrayOf("0", "0"), 2), equalTo("0"))
    }
}
