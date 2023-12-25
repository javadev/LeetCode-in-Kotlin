package g2801_2900.s2874_maximum_value_of_an_ordered_triplet_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumTripletValue() {
        assertThat(Solution().maximumTripletValue(intArrayOf(12, 6, 1, 2, 7)), equalTo(77L))
    }

    @Test
    fun maximumTripletValue2() {
        assertThat(
            Solution().maximumTripletValue(intArrayOf(1, 10, 3, 4, 19)),
            equalTo(133L)
        )
    }

    @Test
    fun maximumTripletValue3() {
        assertThat(Solution().maximumTripletValue(intArrayOf(1, 2, 3)), equalTo(0L))
    }
}
