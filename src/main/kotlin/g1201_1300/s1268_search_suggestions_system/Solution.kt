package g1201_1300.s1268_search_suggestions_system

// #Medium #Array #String #2023_06_08_Time_331_ms_(100.00%)_Space_50.2_MB_(88.89%)

class Solution {
    private var result: MutableList<List<String>> = ArrayList()

    fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
        // Sort products array first in lexicographically order
        products.sort()
        // Iterate through each "type" of searchWord by using substring
        for (endIndex in 1..searchWord.length) {
            val subSearchWord = searchWord.substring(0, endIndex)
            // Find result for each "type" and add to result list
            val curResult = findResult(products, subSearchWord)
            result.add(curResult)
        }
        return result
    }

    private fun findResult(sortedProducts: Array<String>, searchWord: String): List<String> {
        val curResult: MutableList<String> = ArrayList()
        // Binary search returns the first index possible search result
        val startIndex = binarySearch(sortedProducts, searchWord)
        // Iterate the following 3 string in products or exit if reach end first
        var i = startIndex
        while (i < startIndex + 3 && i < sortedProducts.size) {
            val cur = sortedProducts[i]
            // Only add to curResult if prefix match, otherwise break and return
            if (isPrefix(searchWord, cur)) {
                curResult.add(cur)
            } else {
                return curResult
            }
            i++
        }
        return curResult
    }

    // Compare char by char to check if searchWord is a prefix of product
    private fun isPrefix(searchWord: String, product: String): Boolean {
        for (i in searchWord.indices) {
            val sw = searchWord[i]
            val pr = product[i]
            return if (sw == pr) {
                continue
            } else {
                false
            }
        }
        return true
    }

    // Binary search to find the first index of possible search result
    // The word at the found index should be the least word that's greater or equal to
    // the target search word lexicographically.
    private fun binarySearch(sortedProducts: Array<String>, searchWord: String): Int {
        var start = 0
        var end = sortedProducts.size - 1
        while (start < end) {
            val mid = (start + end) / 2
            val midString = sortedProducts[mid]
            // If mid word is lexicographically less than target word,
            // continue search on right side
            if (searchWord.compareTo(midString) > 0) {
                start = mid + 1
                continue
            }
            // If found the exact match
            if (midString == searchWord) {
                return mid
            }
            // If mid word is lexicographically greater than target word (possible solution)
            if (searchWord.compareTo(midString) < 0) {
                // If mid is at 0,
                // or word at (mid - 1) is If mid word is lexicographically less than target word less than target word, this means we found the least word that's greater than target
                return if (mid == 0 || searchWord.compareTo(sortedProducts[mid - 1]) > 0) {
                    mid
                } else {
                    end = mid - 1
                    continue
                }
            }
        }
        return start
    }
}
