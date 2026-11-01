package g3901_4000.s3945_digit_frequency_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun digitFrequencyScore() {
        assertThat<Int>(Solution().digitFrequencyScore(122), equalTo<Int>(5))
    }

    @Test
    fun digitFrequencyScore2() {
        assertThat<Int>(Solution().digitFrequencyScore(101), equalTo<Int>(2))
    }

    @Test
    fun digitFrequencyScore3() {
        assertThat<Int>(Solution().digitFrequencyScore(1), equalTo<Int>(1))
    }

    @Test
    fun digitFrequencyScore4() {
        assertThat<Int>(Solution().digitFrequencyScore(999999999), equalTo<Int>(81))
    }

    @Test
    fun digitFrequencyScore5() {
        assertThat<Int>(Solution().digitFrequencyScore(1000000000), equalTo<Int>(1))
    }

    @Test
    fun digitFrequencyScore6() {
        assertThat<Int>(Solution().digitFrequencyScore(987654321), equalTo<Int>(45))
    }
}
