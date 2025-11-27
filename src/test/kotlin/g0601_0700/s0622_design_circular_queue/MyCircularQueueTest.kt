package g0601_0700.s0622_design_circular_queue

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MyCircularQueueTest {
    @Test
    fun myCircularQueue() {
        val myCircularQueue = MyCircularQueue(3)
        assertThat(myCircularQueue.enQueue(1), equalTo(true))
        assertThat(myCircularQueue.enQueue(2), equalTo(true))
        assertThat(myCircularQueue.enQueue(3), equalTo(true))
        assertThat(myCircularQueue.enQueue(4), equalTo(false))
        assertThat(myCircularQueue.Rear(), equalTo(3))
        assertThat(myCircularQueue.isFull(), equalTo(true))
        assertThat(myCircularQueue.deQueue(), equalTo(true))
        assertThat(myCircularQueue.enQueue(4), equalTo(true))
        assertThat(myCircularQueue.Rear(), equalTo(4))
    }

    @Test
    fun myCircularQueue2() {
        val q = MyCircularQueue(3)
        assertThat(q.enQueue(1), equalTo(true))
        assertThat(q.enQueue(2), equalTo(true))
        assertThat(q.enQueue(3), equalTo(true))
        assertThat(q.enQueue(4), equalTo(false))
        assertThat(q.Rear(), equalTo(3))
        assertThat(q.isFull(), equalTo(true))
        assertThat(q.deQueue(), equalTo(true))
        assertThat(q.enQueue(4), equalTo(true))
        assertThat(q.Rear(), equalTo(4))
    }

    @Test
    fun myCircularQueue3() {
        val q = MyCircularQueue(2)
        assertThat(q.Front(), equalTo(-1))
        assertThat(q.Rear(), equalTo(-1))
        assertThat(q.deQueue(), equalTo(false))
        assertThat(q.isEmpty(), equalTo(true))
    }

    @Test
    fun myCircularQueue4() {
        val q = MyCircularQueue(1)
        assertThat(q.enQueue(10), equalTo(true))
        assertThat(q.isFull(), equalTo(true))
        assertThat(q.Front(), equalTo(10))
        assertThat(q.Rear(), equalTo(10))
        assertThat(q.deQueue(), equalTo(true))
        assertThat(q.isEmpty(), equalTo(true))
        assertThat(q.Front(), equalTo(-1))
        assertThat(q.Rear(), equalTo(-1))
    }

    @Test
    fun myCircularQueue5() {
        val q = MyCircularQueue(3)
        assertThat(q.enQueue(1), equalTo(true))
        assertThat(q.enQueue(2), equalTo(true))
        assertThat(q.enQueue(3), equalTo(true))
        assertThat(q.isFull(), equalTo(true))
        assertThat(q.deQueue(), equalTo(true))
        assertThat(q.enQueue(4), equalTo(true))
        assertThat(q.Front(), equalTo(2))
        assertThat(q.Rear(), equalTo(4))
        assertThat(q.deQueue(), equalTo(true))
        assertThat(q.deQueue(), equalTo(true))
        assertThat(q.deQueue(), equalTo(true))
        assertThat(q.deQueue(), equalTo(false))
    }

    @Test
    fun myCircularQueue6() {
        val q = MyCircularQueue(2)
        assertThat(q.enQueue(5), equalTo(true))
        assertThat(q.enQueue(6), equalTo(true))
        assertThat(q.isFull(), equalTo(true))
        assertThat(q.deQueue(), equalTo(true))
        assertThat(q.deQueue(), equalTo(true))
        assertThat(q.isEmpty(), equalTo(true))
        assertThat(q.enQueue(7), equalTo(true))
        assertThat(q.Front(), equalTo(7))
        assertThat(q.Rear(), equalTo(7))
    }
}
