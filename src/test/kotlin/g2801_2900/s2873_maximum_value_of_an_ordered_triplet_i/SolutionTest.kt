package g2801_2900.s2873_maximum_value_of_an_ordered_triplet_i

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumTripletValue() {
        MatcherAssert.assertThat(Solution().maximumTripletValue(intArrayOf(12, 6, 1, 2, 7)), CoreMatchers.equalTo(77L))
    }

    @Test
    fun maximumTripletValue2() {
        MatcherAssert.assertThat(
            Solution().maximumTripletValue(intArrayOf(1, 10, 3, 4, 19)),
            CoreMatchers.equalTo(133L)
        )
    }

    @Test
    fun maximumTripletValue3() {
        MatcherAssert.assertThat(Solution().maximumTripletValue(intArrayOf(1, 2, 3)), CoreMatchers.equalTo(0L))
    }

    @Test
    fun maximumTripletValue4() {
        MatcherAssert.assertThat(
            Solution()
                .maximumTripletValue(
                    intArrayOf(8, 6, 3, 13, 2, 12, 19, 5, 19, 6, 10, 11, 9)
                ),
            CoreMatchers.equalTo(266L)
        )
    }
}
