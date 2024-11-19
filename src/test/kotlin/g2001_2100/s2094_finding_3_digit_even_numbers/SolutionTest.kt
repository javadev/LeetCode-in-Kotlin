package g2001_2100.s2094_finding_3_digit_even_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findEvenNumbers() {
        assertThat(
            Solution().findEvenNumbers(intArrayOf(2, 1, 3, 0)),
            equalTo(intArrayOf(102, 120, 130, 132, 210, 230, 302, 310, 312, 320)),
        )
    }

    @Test
    fun findEvenNumbers2() {
        assertThat(
            Solution().findEvenNumbers(intArrayOf(2, 2, 8, 8, 2)),
            equalTo(intArrayOf(222, 228, 282, 288, 822, 828, 882)),
        )
    }

    @Test
    fun findEvenNumbers3() {
        assertThat(Solution().findEvenNumbers(intArrayOf(3, 7, 5)), equalTo(intArrayOf()))
    }
}
