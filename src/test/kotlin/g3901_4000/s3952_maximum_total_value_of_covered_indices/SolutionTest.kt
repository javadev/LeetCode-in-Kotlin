package g3901_4000.s3952_maximum_total_value_of_covered_indices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTotal() {
        assertThat<Long>(
            Solution().maxTotal(intArrayOf(9, 2, 6, 1), "0101"),
            equalTo<Long>(15L),
        )
    }

    @Test
    fun maxTotal2() {
        assertThat<Long>(
            Solution().maxTotal(intArrayOf(5, 1, 4), "001"),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun maxTotal3() {
        assertThat<Long>(
            Solution().maxTotal(intArrayOf(9, 3, 5), "011"),
            equalTo<Long>(14L),
        )
    }

    @Test
    fun maxTotal4() {
        assertThat<Long>(Solution().maxTotal(intArrayOf(3), "1"), equalTo<Long>(3L))
    }
}
