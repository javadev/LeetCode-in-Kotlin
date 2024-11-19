package g1701_1800.s1733_minimum_number_of_people_to_teach

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTeachings() {
        assertThat(
            Solution()
                .minimumTeachings(
                    2,
                    arrayOf(intArrayOf(1), intArrayOf(2), intArrayOf(1, 2)),
                    arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3)),
                ),
            equalTo(1),
        )
    }

    @Test
    fun minimumTeachings2() {
        assertThat(
            Solution()
                .minimumTeachings(
                    3,
                    arrayOf(
                        intArrayOf(2),
                        intArrayOf(1, 3),
                        intArrayOf(1, 2),
                        intArrayOf(3),
                    ),
                    arrayOf(
                        intArrayOf(1, 4),
                        intArrayOf(1, 2),
                        intArrayOf(1, 3),
                        intArrayOf(3, 4),
                        intArrayOf(2, 3),
                    ),
                ),
            equalTo(2),
        )
    }
}
