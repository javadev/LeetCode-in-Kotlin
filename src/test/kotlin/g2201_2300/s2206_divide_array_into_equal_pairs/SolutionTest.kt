package g2201_2300.s2206_divide_array_into_equal_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun divideArray() {
        assertThat(Solution().divideArray(intArrayOf(3, 2, 3, 2, 2, 2)), equalTo(true))
    }

    @Test
    fun divideArray2() {
        assertThat(Solution().divideArray(intArrayOf(1, 2, 3, 4)), equalTo(false))
    }
}
