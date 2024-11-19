package g2401_2500.s2449_minimum_number_of_operations_to_make_arrays_similar

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeSimilar() {
        assertThat(
            Solution().makeSimilar(intArrayOf(8, 12, 6), intArrayOf(2, 14, 10)),
            equalTo(2L),
        )
    }

    @Test
    fun makeSimilar2() {
        assertThat(
            Solution().makeSimilar(intArrayOf(1, 2, 5), intArrayOf(4, 1, 3)),
            equalTo(1L),
        )
    }

    @Test
    fun makeSimilar3() {
        assertThat(
            Solution().makeSimilar(intArrayOf(1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1)),
            equalTo(0L),
        )
    }
}
