package g3001_3100.s3099_harshad_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfTheDigitsOfHarshadNumber() {
        assertThat(Solution().sumOfTheDigitsOfHarshadNumber(18), equalTo(9))
    }

    @Test
    fun sumOfTheDigitsOfHarshadNumber2() {
        assertThat(Solution().sumOfTheDigitsOfHarshadNumber(23), equalTo(-1))
    }
}
