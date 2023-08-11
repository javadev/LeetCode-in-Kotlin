package g1601_1700.s1687_delivering_boxes_from_storage_to_ports

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun boxDelivering() {
        assertThat(
            Solution().boxDelivering(
                arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(1, 1)),
                2, 3, 3
            ),
            equalTo(4)
        )
    }

    @Test
    fun boxDelivering2() {
        assertThat(
            Solution()
                .boxDelivering(
                    arrayOf(
                        intArrayOf(1, 2), intArrayOf(3, 3), intArrayOf(3, 1),
                        intArrayOf(3, 1), intArrayOf(2, 4)
                    ),
                    3, 3, 6
                ),
            equalTo(6)
        )
    }

    @Test
    fun boxDelivering3() {
        assertThat(
            Solution()
                .boxDelivering(
                    arrayOf(
                        intArrayOf(1, 4), intArrayOf(1, 2), intArrayOf(2, 1),
                        intArrayOf(2, 1), intArrayOf(3, 2), intArrayOf(3, 4)
                    ),
                    3,
                    6,
                    7
                ),
            equalTo(6)
        )
    }
}
