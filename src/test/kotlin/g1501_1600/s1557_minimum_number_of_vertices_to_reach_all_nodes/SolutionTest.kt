package g1501_1600.s1557_minimum_number_of_vertices_to_reach_all_nodes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSmallestSetOfVertices() {
        assertThat(
            Solution()
                .findSmallestSetOfVertices(
                    6,
                    listOf(
                        mutableListOf<Int>(0, 1),
                        mutableListOf<Int>(0, 2),
                        mutableListOf<Int>(2, 5),
                        mutableListOf<Int>(3, 4),
                        mutableListOf<Int>(4, 2),
                    ),
                ),
            equalTo(mutableListOf(0, 3)),
        )
    }

    @Test
    fun findSmallestSetOfVertices2() {
        assertThat(
            Solution()
                .findSmallestSetOfVertices(
                    5,
                    listOf(
                        mutableListOf<Int>(0, 1),
                        mutableListOf<Int>(2, 1),
                        mutableListOf<Int>(3, 1),
                        mutableListOf<Int>(1, 4),
                        mutableListOf<Int>(2, 4),
                    ),
                ),
            equalTo(mutableListOf(0, 2, 3)),
        )
    }
}
