package g1101_1200.s1114_print_in_order

// #Easy #Concurrency

class Foo {
    @Volatile
    private var firstFinished = false

    @Volatile
    private var secondFinished = false
    fun first(printFirst: Runnable) {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run()
        firstFinished = true
    }

    fun second(printSecond: Runnable) {
        // printSecond.run() outputs "second". Do not change or remove this line.
        while (true) {
            if (firstFinished) {
                printSecond.run()
                secondFinished = true
                break
            }
        }
    }

    fun third(printThird: Runnable) {
        // printThird.run() outputs "third". Do not change or remove this line.
        while (true) {
            if (firstFinished && secondFinished) {
                printThird.run()
                break
            }
        }
    }
}
