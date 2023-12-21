package g2801_2900.s2807_insert_greatest_common_divisors_in_linked_list

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun insertGreatestCommonDivisors() {
        assertThat(
            Solution()
                .insertGreatestCommonDivisors(
                    contructLinkedList(intArrayOf(18, 6, 10, 3))
                )
                .toString(),
            equalTo(
                contructLinkedList(intArrayOf(18, 6, 6, 2, 10, 1, 3))
                    .toString()
            )
        )
    }

    @Test
    fun insertGreatestCommonDivisors2() {
        assertThat(
            Solution()
                .insertGreatestCommonDivisors(
                    contructLinkedList(intArrayOf(7))
                )
                .toString(),
            equalTo(contructLinkedList(intArrayOf(7)).toString())
        )
    }
}
