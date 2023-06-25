package g2101_2200.s2165_smallest_value_of_the_rearranged_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestNumber() {
        assertThat(Solution().smallestNumber(310L), equalTo(103L))
    }

    @Test
    fun smallestNumber2() {
        assertThat(Solution().smallestNumber(-7605L), equalTo(-7650L))
    }
}
