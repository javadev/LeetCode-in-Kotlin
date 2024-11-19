package g2801_2900.s2895_minimum_processing_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minProcessingTime() {
        assertThat(
            Solution()
                .minProcessingTime(
                    mutableListOf(8, 10),
                    mutableListOf(2, 2, 3, 1, 8, 7, 4, 5),
                ),
            equalTo(16),
        )
    }

    @Test
    fun minProcessingTime2() {
        assertThat(
            Solution()
                .minProcessingTime(
                    mutableListOf(10, 20),
                    mutableListOf(2, 3, 1, 2, 5, 8, 4, 3),
                ),
            equalTo(23),
        )
    }
}
