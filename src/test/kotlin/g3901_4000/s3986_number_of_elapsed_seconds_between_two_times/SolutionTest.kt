package g3901_4000.s3986_number_of_elapsed_seconds_between_two_times

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun secondsBetweenTimes() {
        assertThat<Int>(
            Solution().secondsBetweenTimes("01:00:00", "01:00:25"),
            equalTo<Int>(25),
        )
    }

    @Test
    fun secondsBetweenTimes2() {
        assertThat<Int>(
            Solution().secondsBetweenTimes("12:34:56", "13:00:00"),
            equalTo<Int>(1504),
        )
    }

    @Test
    fun secondsBetweenTimes3() {
        assertThat<Int>(
            Solution().secondsBetweenTimes("00:00:00", "00:00:00"),
            equalTo<Int>(0),
        )
    }
}
