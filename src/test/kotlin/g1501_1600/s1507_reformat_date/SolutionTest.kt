package g1501_1600.s1507_reformat_date

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reformatDate() {
        assertThat(Solution().reformatDate("20th Oct 2052"), equalTo("2052-10-20"))
    }

    @Test
    fun reformatDate2() {
        assertThat(Solution().reformatDate("6th Jun 1933"), equalTo("1933-06-06"))
    }

    @Test
    fun reformatDate3() {
        assertThat(Solution().reformatDate("26th May 1960"), equalTo("1960-05-26"))
    }
}
