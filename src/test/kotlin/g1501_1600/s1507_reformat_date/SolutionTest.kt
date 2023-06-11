package g1501_1600.s1507_reformat_date

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reformatDate() {
        MatcherAssert.assertThat(Solution().reformatDate("20th Oct 2052"), CoreMatchers.equalTo("2052-10-20"))
    }

    @Test
    fun reformatDate2() {
        MatcherAssert.assertThat(Solution().reformatDate("6th Jun 1933"), CoreMatchers.equalTo("1933-06-06"))
    }

    @Test
    fun reformatDate3() {
        MatcherAssert.assertThat(Solution().reformatDate("26th May 1960"), CoreMatchers.equalTo("1960-05-26"))
    }
}
