package g3101_3200.s3134_find_the_median_of_the_uniqueness_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun medianOfUniquenessArray() {
        assertThat(Solution().medianOfUniquenessArray(intArrayOf(1, 2, 3)), equalTo(1))
    }

    @Test
    fun medianOfUniquenessArray2() {
        assertThat(Solution().medianOfUniquenessArray(intArrayOf(3, 4, 3, 4, 5)), equalTo(2))
    }

    @Test
    fun medianOfUniquenessArray3() {
        assertThat(Solution().medianOfUniquenessArray(intArrayOf(4, 3, 5, 4)), equalTo(2))
    }
}
