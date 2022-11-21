package g0201_0300.s0225_implement_stack_using_queues

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MyStackTest {
    @Test
    fun stackUsingQueue() {
        val stack = MyStack()
        stack.push(1)
        stack.push(2)
        assertThat(stack.top(), equalTo(2))
        assertThat(stack.pop(), equalTo(2))
        assertThat(stack.empty(), equalTo(false))
    }
}
