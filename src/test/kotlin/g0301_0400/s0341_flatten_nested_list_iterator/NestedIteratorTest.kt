package g0301_0400.s0341_flatten_nested_list_iterator

import com_github_leetcode.NestedInteger
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class NestedIteratorTest {
    @Test
    fun nestedIterator() {
        val iterator = NestedIterator(
            mutableListOf(
                NestedInteger(
                    mutableListOf(NestedInteger(1), NestedInteger(1)),
                ),
                NestedInteger(2),
                NestedInteger(
                    mutableListOf(
                        NestedInteger(1),
                        NestedInteger(1),
                    ),
                ),
            ),
        )
        val result: MutableList<Int> = ArrayList()
        while (iterator.hasNext()) {
            result.add(iterator.next())
        }
        assertThat(result, equalTo(listOf(1, 1, 2, 1, 1)))
    }

    @Test
    fun nestedIterator2() {
        val integer1 = NestedInteger(1)
        val integer2 = NestedInteger(2)
        val integer3 = NestedInteger(3)
        val list: MutableList<NestedInteger> = ArrayList()
        list.add(integer1)
        list.add(integer2)
        list.add(integer3)
        val nestedIntegerList = NestedInteger(list)
        val input: MutableList<NestedInteger> = ArrayList()
        input.add(integer1)
        input.add(integer2)
        input.add(nestedIntegerList)
        input.add(integer3)
        val iterator = NestedIterator(input)
        val result: MutableList<Int> = ArrayList()
        while (iterator.hasNext()) {
            result.add(iterator.next())
        }
        assertThat(result, equalTo(listOf(1, 2, 1, 2, 3, 3)))
    }
}
