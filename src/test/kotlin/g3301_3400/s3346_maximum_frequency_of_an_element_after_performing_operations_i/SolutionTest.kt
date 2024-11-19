package g3301_3400.s3346_maximum_frequency_of_an_element_after_performing_operations_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxFrequency() {
        assertThat<Int>(
            Solution().maxFrequency(intArrayOf(1, 4, 5), 1, 2),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxFrequency2() {
        assertThat<Int>(
            Solution().maxFrequency(intArrayOf(5, 11, 20, 20), 5, 1),
            equalTo<Int>(2),
        )
    }
}
