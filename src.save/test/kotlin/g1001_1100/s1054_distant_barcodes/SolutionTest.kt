package g1001_1100.s1054_distant_barcodes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rearrangeBarcodes() {
        assertThat(
            Solution().rearrangeBarcodes(intArrayOf(1, 1, 1, 2, 2, 2)),
            equalTo(intArrayOf(1, 2, 1, 2, 1, 2))
        )
    }

    @Test
    fun rearrangeBarcodes2() {
        assertThat(
            Solution().rearrangeBarcodes(intArrayOf(1, 1, 1, 1, 2, 2, 3, 3)),
            equalTo(intArrayOf(1, 3, 1, 2, 1, 2, 3, 1))
        )
    }
}
