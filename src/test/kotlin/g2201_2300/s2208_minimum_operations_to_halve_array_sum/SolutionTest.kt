package g2201_2300.s2208_minimum_operations_to_halve_array_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun halveArray() {
        assertThat(Solution().halveArray(intArrayOf(5, 19, 8, 1)), equalTo(3))
    }

    @Test
    fun halveArray2() {
        assertThat(Solution().halveArray(intArrayOf(3, 8, 20)), equalTo(3))
    }
}
