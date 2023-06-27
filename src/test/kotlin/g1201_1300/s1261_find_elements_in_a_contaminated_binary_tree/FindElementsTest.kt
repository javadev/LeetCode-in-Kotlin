package g1201_1300.s1261_find_elements_in_a_contaminated_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class FindElementsTest {
    @Test
    fun findElementsTest() {
        val findElements = FindElements(TreeNode.create(listOf(-1, null, -1)))
        assertThat(findElements.find(1), equalTo(false))
        assertThat(findElements.find(2), equalTo(true))
    }

    @Test
    fun findElementsTest2() {
        val findElements = FindElements(TreeNode.create(listOf(-1, -1, -1, -1, -1)))
        assertThat(findElements.find(1), equalTo(true))
        assertThat(findElements.find(3), equalTo(true))
        assertThat(findElements.find(5), equalTo(false))
    }

    @Test
    fun findElementsTest3() {
        val findElements = FindElements(TreeNode.create(listOf(-1, null, -1, -1, null, -1)))
        assertThat(findElements.find(2), equalTo(true))
        assertThat(findElements.find(3), equalTo(false))
        assertThat(findElements.find(4), equalTo(false))
        assertThat(findElements.find(5), equalTo(true))
    }
}
