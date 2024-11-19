package g1801_1900.s1847_closest_room

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun closestRoom() {
        assertThat(
            Solution()
                .closestRoom(
                    arrayOf(intArrayOf(2, 2), intArrayOf(1, 2), intArrayOf(3, 2)),
                    arrayOf(intArrayOf(3, 1), intArrayOf(3, 3), intArrayOf(5, 2)),
                ),
            equalTo(intArrayOf(3, -1, 3)),
        )
    }

    @Test
    fun closestRoom2() {
        assertThat(
            Solution()
                .closestRoom(
                    arrayOf(
                        intArrayOf(1, 4),
                        intArrayOf(2, 3),
                        intArrayOf(3, 5),
                        intArrayOf(4, 1),
                        intArrayOf(5, 2),
                    ),
                    arrayOf(intArrayOf(2, 3), intArrayOf(2, 4), intArrayOf(2, 5)),
                ),
            equalTo(intArrayOf(2, 1, 3)),
        )
    }
}
