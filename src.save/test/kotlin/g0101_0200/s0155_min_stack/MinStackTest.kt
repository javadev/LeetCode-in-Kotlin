package g0101_0200.s0155_min_stack

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MinStackTest {
    @Test
    fun minStack() {
        val minStack = MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        // return -3
        assertThat(minStack.getMin(), equalTo(-3))
        minStack.pop()
        // return 0
        assertThat(minStack.top(), equalTo(0))
        // return -2
        assertThat(minStack.getMin(), equalTo(-2))
    }
}
