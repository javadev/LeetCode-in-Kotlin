package g1101_1200.s1154_day_of_the_year

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun dayOfYear() {
        assertThat(Solution().dayOfYear("2019-01-09"), equalTo(9))
    }

    @Test
    fun dayOfYear2() {
        assertThat(Solution().dayOfYear("2019-02-10"), equalTo(41))
    }

    @Test
    fun dayOfYear3() {
        assertThat(Solution().dayOfYear("2020-02-01"), equalTo(32))
    }

    @Test
    fun dayOfYear4() {
        assertThat(Solution().dayOfYear("2020-03-01"), equalTo(61))
    }

    @Test
    fun dayOfYear5() {
        assertThat(Solution().dayOfYear("2019-02-28"), equalTo(59))
    }

    @Test
    fun dayOfYear6() {
        assertThat(Solution().dayOfYear("2020-02-29"), equalTo(60))
    }

    @Test
    fun dayOfYear7() {
        assertThat(Solution().dayOfYear("2019-12-31"), equalTo(365))
    }

    @Test
    fun dayOfYear8() {
        assertThat(Solution().dayOfYear("2020-12-31"), equalTo(366))
    }

    @Test
    fun dayOfYear9() {
        assertThat(Solution().dayOfYear("2021-01-01"), equalTo(1))
    }

    @Test
    fun dayOfYear10() {
        assertThat(Solution().dayOfYear("2021-07-04"), equalTo(185))
    }

    @Test
    fun dayOfYear11() {
        assertThat(Solution().dayOfYear("2000-02-29"), equalTo(60))
    }

    @Test
    fun dayOfYear12() {
        assertThat(Solution().dayOfYear("1900-03-01"), equalTo(60))
    }
}
