package g2301_2400.s2312_selling_pieces_of_wood

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sellingWood() {
        assertThat(
            Solution().sellingWood(3, 5, arrayOf(intArrayOf(1, 4, 2), intArrayOf(2, 2, 7), intArrayOf(2, 1, 3))),
            equalTo(19L)
        )
    }

    @Test
    fun sellingWood2() {
        assertThat(
            Solution().sellingWood(4, 6, arrayOf(intArrayOf(3, 2, 10), intArrayOf(1, 4, 2), intArrayOf(4, 1, 3))),
            equalTo(32L)
        )
    }
}
