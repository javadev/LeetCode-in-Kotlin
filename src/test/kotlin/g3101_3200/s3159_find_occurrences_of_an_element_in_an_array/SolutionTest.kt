package g3101_3200.s3159_find_occurrences_of_an_element_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun occurrencesOfElement() {
        assertThat(
            Solution()
                .occurrencesOfElement(intArrayOf(1, 3, 1, 7), intArrayOf(1, 3, 2, 4), 1),
            equalTo(intArrayOf(0, -1, 2, -1)),
        )
    }

    @Test
    fun occurrencesOfElement2() {
        assertThat(
            Solution().occurrencesOfElement(intArrayOf(1, 2, 3), intArrayOf(10), 5),
            equalTo(intArrayOf(-1)),
        )
    }
}
