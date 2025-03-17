package g3401_3500.s3490_count_beautiful_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun beautifulNumbers() {
        assertThat<Int>(Solution().beautifulNumbers(10, 20), equalTo<Int>(2))
    }

    @Test
    fun beautifulNumbers2() {
        assertThat<Int>(Solution().beautifulNumbers(1, 15), equalTo<Int>(10))
    }

    @Test
    fun beautifulNumbers3() {
        assertThat<Int>(
            Solution().beautifulNumbers(6725, 270910825),
            equalTo<Int>(178996547),
        )
    }
}
