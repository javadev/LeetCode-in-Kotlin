package g1301_1400.s1363_largest_multiple_of_three

// #Hard #Array #Dynamic_Programming #Greedy
class Solution {
    fun largestMultipleOfThree(digits: IntArray): String {
        var sum = 0
        val count = IntArray(10)
        // Here we are using the property that any no is divisible by 3 when its sum of digits is
        // divisible by 3
        // get sum of digits and count of each digit
        for (x in digits) {
            sum += x
            count[x]++
        }
        val sb = StringBuilder()
        var copied = count.copyOf(count.size)
        // if sum % 3 != 0 then processing required
        if (sum % 3 != 0) {
            var rem = sum % 3
            var oldRem = rem
            while (oldRem != 0) {
                while (rem != 0) {
                    // if the remainder that we are trying to delete and its required digits is not
                    // present
                    // then the value will become -ve at that digit
                    copied[rem % 10]--
                    // increase the remainder by 3 each time a -ve value is found
                    // and reset the rem and copied from orig count array and break
                    if (copied[rem % 10] < 0) {
                        oldRem += 3
                        rem = oldRem
                        copied = count.copyOf(count.size)
                        break
                    }
                    rem /= 10
                    if (rem == 0) {
                        oldRem = 0
                    }
                }
            }
        }
        // generate the largest number by considering from the last digit ie 9,8,7,6...
        for (i in 9 downTo 0) {
            var `val` = copied[i]
            while (`val` > 0) {
                sb.append(i)
                `val`--
            }
        }
        // check for any leading zeroes and remove
        while (sb.length > 1) {
            if (sb[0] != '0') {
                break
            } else {
                sb.deleteCharAt(0)
            }
        }
        return sb.toString()
    }
}
