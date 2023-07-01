package g2301_2400.s2338_count_the_number_of_ideal_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun idealArrays() {
        assertThat(Solution().idealArrays(2, 5), equalTo(10))
    }

    @Test
    fun idealArrays2() {
        assertThat(Solution().idealArrays(5, 3), equalTo(11))
    }
}
