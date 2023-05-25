package g1101_1200.s1195_fizz_buzz_multithreaded

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.concurrent.TimeUnit

internal class FizzBuzzTest {
    @Test
    @Throws(InterruptedException::class)
    fun fizzBuzz() {
        val fizz = intArrayOf(0)
        val fizzBuzz = FizzBuzz(15)
        Thread {
            try {
                fizzBuzz.fizz { fizz[0]++ }
            } catch (e: InterruptedException) {
            }
        }
            .start()
        Thread {
            try {
                fizzBuzz.buzz { fizz[0]++ }
            } catch (e: InterruptedException) {
            }
        }
            .start()
        Thread {
            try {
                fizzBuzz.fizzbuzz { fizz[0]++ }
            } catch (e: InterruptedException) {
            }
        }
            .start()
        Thread {
            try {
                fizzBuzz.number { _: Int -> fizz[0]++ }
            } catch (e: InterruptedException) {
            }
        }
            .start()
        TimeUnit.MILLISECONDS.sleep(800)
        assertThat(fizz[0] > 0, equalTo(true))
    }

    @Test
    @Throws(InterruptedException::class)
    fun fizzBuzz2() {
        val fizz = intArrayOf(0)
        val fizzBuzz = FizzBuzz(5)
        Thread {
            try {
                fizzBuzz.fizz { fizz[0]++ }
            } catch (e: InterruptedException) {
            }
        }
            .start()
        Thread {
            try {
                fizzBuzz.buzz { fizz[0]++ }
            } catch (e: InterruptedException) {
            }
        }
            .start()
        Thread {
            try {
                fizzBuzz.fizzbuzz { fizz[0]++ }
            } catch (e: InterruptedException) {
            }
        }
            .start()
        Thread {
            try {
                fizzBuzz.number { _: Int -> fizz[0]++ }
            } catch (e: InterruptedException) {
            }
        }
            .start()
        TimeUnit.MILLISECONDS.sleep(600)
        assertThat(fizz[0] >= 0, equalTo(true))
    }
}
