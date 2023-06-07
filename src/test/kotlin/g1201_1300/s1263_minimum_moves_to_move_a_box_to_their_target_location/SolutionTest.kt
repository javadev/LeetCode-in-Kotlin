package g1201_1300.s1263_minimum_moves_to_move_a_box_to_their_target_location

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minPushBox() {
        assertThat(
            Solution()
                .minPushBox(
                    arrayOf(
                        charArrayOf('#', '#', '#', '#', '#', '#'),
                        charArrayOf('#', 'T', '#', '#', '#', '#'),
                        charArrayOf('#', '.', '.', 'B', '.', '#'),
                        charArrayOf('#', '.', '#', '#', '.', '#'),
                        charArrayOf('#', '.', '.', '.', 'S', '#'),
                        charArrayOf('#', '#', '#', '#', '#', '#')
                    )
                ),
            equalTo(3)
        )
    }

    @Test
    fun minPushBox2() {
        assertThat(
            Solution()
                .minPushBox(
                    arrayOf(
                        charArrayOf('#', '#', '#', '#', '#', '#'),
                        charArrayOf('#', 'T', '#', '#', '#', '#'),
                        charArrayOf('#', '.', '.', 'B', '.', '#'),
                        charArrayOf('#', '#', '#', '#', '.', '#'),
                        charArrayOf('#', '.', '.', '.', 'S', '#'),
                        charArrayOf('#', '#', '#', '#', '#', '#')
                    )
                ),
            equalTo(-1)
        )
    }

    @Test
    fun minPushBox3() {
        assertThat(
            Solution()
                .minPushBox(
                    arrayOf(
                        charArrayOf('#', '#', '#', '#', '#', '#'),
                        charArrayOf('#', 'T', '.', '.', '#', '#'),
                        charArrayOf('#', '.', '#', 'B', '.', '#'),
                        charArrayOf('#', '.', '.', '.', '.', '#'),
                        charArrayOf('#', '.', '.', '.', 'S', '#'),
                        charArrayOf('#', '#', '#', '#', '#', '#')
                    )
                ),
            equalTo(5)
        )
    }
}
