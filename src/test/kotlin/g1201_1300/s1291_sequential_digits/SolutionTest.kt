package g1201_1300.s1291_sequential_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sequentialDigits() {
        assertThat(Solution().sequentialDigits(100, 300), equalTo(mutableListOf(123, 234)))
    }

    @Test
    fun sequentialDigits2() {
        assertThat(
            Solution().sequentialDigits(1000, 13000),
            equalTo(mutableListOf(1234, 2345, 3456, 4567, 5678, 6789, 12345))
        )
    }
}
