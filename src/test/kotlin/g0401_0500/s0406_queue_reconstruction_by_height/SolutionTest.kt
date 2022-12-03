package g0401_0500.s0406_queue_reconstruction_by_height

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reconstructQueue() {
        assertThat(
            Solution()
                .reconstructQueue(
                    arrayOf(
                        intArrayOf(7, 0),
                        intArrayOf(4, 4),
                        intArrayOf(7, 1),
                        intArrayOf(5, 0),
                        intArrayOf(6, 1),
                        intArrayOf(5, 2)
                    )
                ),
            equalTo(
                arrayOf(
                    intArrayOf(5, 0),
                    intArrayOf(7, 0),
                    intArrayOf(5, 2),
                    intArrayOf(6, 1),
                    intArrayOf(4, 4),
                    intArrayOf(7, 1)
                )
            )
        )
    }

    @Test
    fun reconstructQueue2() {
        assertThat(
            Solution()
                .reconstructQueue(
                    arrayOf(
                        intArrayOf(6, 0),
                        intArrayOf(5, 0),
                        intArrayOf(4, 0),
                        intArrayOf(3, 2),
                        intArrayOf(2, 2),
                        intArrayOf(1, 4)
                    )
                ),
            equalTo(
                arrayOf(
                    intArrayOf(4, 0),
                    intArrayOf(5, 0),
                    intArrayOf(2, 2),
                    intArrayOf(3, 2),
                    intArrayOf(1, 4),
                    intArrayOf(6, 0)
                )
            )
        )
    }

}
