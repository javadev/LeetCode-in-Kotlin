package g1501_1600.s1579_remove_max_number_of_edges_to_keep_graph_fully_traversable

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNumEdgesToRemove() {
        assertThat(
            Solution()
                .maxNumEdgesToRemove(
                    4,
                    arrayOf(
                        intArrayOf(3, 1, 2),
                        intArrayOf(3, 2, 3),
                        intArrayOf(1, 1, 3),
                        intArrayOf(1, 2, 4),
                        intArrayOf(1, 1, 2),
                        intArrayOf(2, 3, 4)
                    )
                ),
            equalTo(2)
        )
    }

    @Test
    fun maxNumEdgesToRemove2() {
        assertThat(
            Solution()
                .maxNumEdgesToRemove(
                    4, arrayOf(intArrayOf(3, 1, 2), intArrayOf(3, 2, 3), intArrayOf(1, 1, 4), intArrayOf(2, 1, 4))
                ),
            equalTo(0)
        )
    }

    @Test
    fun maxNumEdgesToRemove3() {
        assertThat(
            Solution()
                .maxNumEdgesToRemove(4, arrayOf(intArrayOf(3, 2, 3), intArrayOf(1, 1, 2), intArrayOf(2, 3, 4))),
            equalTo(-1)
        )
    }
}
