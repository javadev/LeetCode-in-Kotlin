package g3401_3500.s3474_lexicographically_smallest_generated_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun generateString() {
        assertThat<String>(
            Solution().generateString("TFTF", "ab"),
            equalTo<String>("ababa"),
        )
    }

    @Test
    fun generateString2() {
        assertThat<String>(Solution().generateString("TFTF", "abc"), equalTo<String>(""))
    }

    @Test
    fun generateString3() {
        assertThat<String>(Solution().generateString("F", "d"), equalTo<String>("a"))
    }

    @Test
    fun generateString4() {
        assertThat<String>(Solution().generateString("TTFFT", "fff"), equalTo<String>(""))
    }

    @Test
    fun generateString5() {
        assertThat<String>(
            Solution().generateString("FFTFFF", "a"),
            equalTo<String>("bbabbb"),
        )
    }
}
