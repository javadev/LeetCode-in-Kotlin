package g2801_2900.s2861_maximum_number_of_alloys

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNumberOfAlloys() {
        assertThat(
            Solution()
                .maxNumberOfAlloys(
                    3,
                    2,
                    15,
                    listOf<List<Int>>(mutableListOf(1, 1, 1), mutableListOf(1, 1, 10)),
                    mutableListOf(0, 0, 0),
                    mutableListOf(1, 2, 3),
                ),
            equalTo(2),
        )
    }

    @Test
    fun maxNumberOfAlloys2() {
        assertThat(
            Solution()
                .maxNumberOfAlloys(
                    3,
                    2,
                    15,
                    listOf<List<Int>>(mutableListOf(1, 1, 1), mutableListOf(1, 1, 10)),
                    mutableListOf(0, 0, 100),
                    mutableListOf(1, 2, 3),
                ),
            equalTo(5),
        )
    }

    @Test
    fun maxNumberOfAlloys3() {
        assertThat(
            Solution()
                .maxNumberOfAlloys(
                    2,
                    3,
                    10,
                    listOf<List<Int>>(
                        mutableListOf(2, 1),
                        mutableListOf(1, 2),
                        mutableListOf(1, 1),
                    ),
                    mutableListOf(1, 1),
                    mutableListOf(5, 5),
                ),
            equalTo(2),
        )
    }
}
