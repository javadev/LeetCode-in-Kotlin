package g0201_0300.s0232_implement_queue_using_stacks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MyQueueTest {
    @Test
    fun queueUsingStacks() {
        val myQueue = MyQueue()
        myQueue.push(1)
        myQueue.push(2)
        assertThat(myQueue.peek(), equalTo(1))
        assertThat(myQueue.pop(), equalTo(1))
        assertThat(myQueue.empty(), equalTo(false))
    }
}
