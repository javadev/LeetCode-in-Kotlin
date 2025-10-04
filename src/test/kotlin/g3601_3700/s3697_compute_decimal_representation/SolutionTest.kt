package g3601_3700.s3697_compute_decimal_representation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun decimalRepresentation() {
        assertThat<IntArray>(
            Solution().decimalRepresentation(537),
            equalTo<IntArray>(intArrayOf(500, 30, 7)),
        )
    }

    @Test
    fun decimalRepresentation2() {
        assertThat<IntArray>(
            Solution().decimalRepresentation(102),
            equalTo<IntArray>(intArrayOf(100, 2)),
        )
    }

    @Test
    fun decimalRepresentation3() {
        assertThat<IntArray>(
            Solution().decimalRepresentation(6),
            equalTo<IntArray>(intArrayOf(6)),
        )
    }
}
