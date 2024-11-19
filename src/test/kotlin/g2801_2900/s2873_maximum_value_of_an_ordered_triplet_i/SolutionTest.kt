package g2801_2900.s2873_maximum_value_of_an_ordered_triplet_i

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
            equalTo(133L),
        )
    }

    @Test
    fun maximumTripletValue3() {
        assertThat(Solution().maximumTripletValue(intArrayOf(1, 2, 3)), equalTo(0L))
    }

    @Test
    fun maximumTripletValue4() {
        assertThat(
            Solution()
                .maximumTripletValue(
                    intArrayOf(8, 6, 3, 13, 2, 12, 19, 5, 19, 6, 10, 11, 9),
                ),
            equalTo(266L),
        )
    }
}
