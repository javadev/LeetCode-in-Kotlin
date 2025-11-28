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

    @Test
    fun queuePushPopPeekMultiple() {
        val myQueue = MyQueue()
        myQueue.push(10)
        myQueue.push(20)
        myQueue.push(30)

        assertThat(myQueue.peek(), equalTo(10))
        assertThat(myQueue.pop(), equalTo(10))
        assertThat(myQueue.peek(), equalTo(20))
        assertThat(myQueue.pop(), equalTo(20))
        assertThat(myQueue.peek(), equalTo(30))
        assertThat(myQueue.pop(), equalTo(30))
        assertThat(myQueue.empty(), equalTo(true))
    }

    @Test
    fun queueEmptyInitially() {
        val myQueue = MyQueue()
        assertThat(myQueue.empty(), equalTo(true))
    }

    @Test
    fun queuePushAfterPopAll() {
        val myQueue = MyQueue()
        myQueue.push(1)
        myQueue.push(2)

        assertThat(myQueue.pop(), equalTo(1))
        assertThat(myQueue.pop(), equalTo(2))
        assertThat(myQueue.empty(), equalTo(true))

        myQueue.push(3)
        assertThat(myQueue.peek(), equalTo(3))
        assertThat(myQueue.empty(), equalTo(false))
    }

    @Test
    fun queuePeekDoesNotRemove() {
        val myQueue = MyQueue()
        myQueue.push(5)
        myQueue.push(6)

        assertThat(myQueue.peek(), equalTo(5))
        assertThat(myQueue.peek(), equalTo(5))
        assertThat(myQueue.pop(), equalTo(5))
        assertThat(myQueue.peek(), equalTo(6))
    }

    @Test
    fun pushAfterPopTriggersRightToLeft() {
        val myQueue = MyQueue()
        myQueue.push(1)
        myQueue.push(2)

        assertThat(myQueue.pop(), equalTo(1))

        myQueue.push(3)

        assertThat(myQueue.pop(), equalTo(2))
        assertThat(myQueue.pop(), equalTo(3))
        assertThat(myQueue.empty(), equalTo(true))
    }
}
