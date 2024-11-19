package g0801_0900.s0841_keys_and_rooms

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canVisitAllRooms() {
        assertThat(
            Solution()
                .canVisitAllRooms(
                    listOf(listOf(1), listOf(2), listOf(3), emptyList()),
                ),
            equalTo(true),
        )
    }

    @Test
    fun canVisitAllRooms2() {
        assertThat(
            Solution()
                .canVisitAllRooms(
                    listOf(
                        listOf(1, 3),
                        listOf(3, 0, 1),
                        listOf(2),
                        listOf(0),
                    ),
                ),
            equalTo(false),
        )
    }
}
