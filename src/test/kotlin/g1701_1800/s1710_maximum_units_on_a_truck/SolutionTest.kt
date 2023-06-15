package g1701_1800.s1710_maximum_units_on_a_truck

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumUnits() {
        assertThat(
                Solution().maximumUnits(arrayOf(intArrayOf(1, 3), intArrayOf(2, 2), intArrayOf(3, 1)), 4), equalTo(8))
    }

    @Test
    fun maximumUnits2() {
        assertThat(
                Solution().maximumUnits(arrayOf(intArrayOf(5, 10), intArrayOf(2, 5), intArrayOf(4, 7), intArrayOf(3, 9)), 10),
                equalTo(91))
    }
}
