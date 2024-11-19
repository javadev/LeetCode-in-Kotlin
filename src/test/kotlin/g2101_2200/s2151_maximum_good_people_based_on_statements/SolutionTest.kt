package g2101_2200.s2151_maximum_good_people_based_on_statements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumGood() {
        assertThat(
            Solution().maximumGood(arrayOf(intArrayOf(2, 1, 2), intArrayOf(1, 2, 2), intArrayOf(2, 0, 2))),
            equalTo(2),
        )
    }

    @Test
    fun maximumGood2() {
        assertThat(
            Solution().maximumGood(arrayOf(intArrayOf(2, 0), intArrayOf(0, 2))),
            equalTo(1),
        )
    }
}
