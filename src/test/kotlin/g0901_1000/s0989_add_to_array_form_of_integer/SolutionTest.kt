package g0901_1000.s0989_add_to_array_form_of_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addToArrayForm() {
        assertThat(
            Solution().addToArrayForm(intArrayOf(1, 2, 0, 0), 34),
            equalTo(listOf(1, 2, 3, 4))
        )
    }

    @Test
    fun addToArrayForm2() {
        assertThat(
            Solution().addToArrayForm(intArrayOf(2, 7, 4), 181),
            equalTo(listOf(4, 5, 5))
        )
    }

    @Test
    fun addToArrayForm3() {
        assertThat(
            Solution().addToArrayForm(intArrayOf(2, 1, 5), 806),
            equalTo(listOf(1, 0, 2, 1))
        )
    }
}
