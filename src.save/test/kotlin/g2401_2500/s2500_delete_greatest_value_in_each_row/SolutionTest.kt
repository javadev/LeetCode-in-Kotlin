package g2401_2500.s2500_delete_greatest_value_in_each_row

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun deleteGreatestValue() {
        assertThat(
            Solution().deleteGreatestValue(arrayOf(intArrayOf(1, 2, 4), intArrayOf(3, 3, 1))), equalTo(8)
        )
    }

    @Test
    fun deleteGreatestValue2() {
        assertThat(Solution().deleteGreatestValue(arrayOf(intArrayOf(10))), equalTo(10))
    }
}
