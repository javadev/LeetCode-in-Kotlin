745\. Prefix and Suffix Search

Hard

Design a special dictionary that searches the words in it by a prefix and a suffix.

Implement the `WordFilter` class:

*   `WordFilter(string[] words)` Initializes the object with the `words` in the dictionary.
*   `f(string pref, string suff)` Returns _the index of the word in the dictionary,_ which has the prefix `pref` and the suffix `suff`. If there is more than one valid index, return **the largest** of them. If there is no such word in the dictionary, return `-1`.

**Example 1:**

**Input** ["WordFilter", "f"] [[["apple"]], ["a", "e"]]

**Output:** [null, 0]

**Explanation:** WordFilter wordFilter = new WordFilter(["apple"]); wordFilter.f("a", "e"); // return 0, because the word at index 0 has prefix = "a" and suffix = "e".

**Constraints:**

*   <code>1 <= words.length <= 10<sup>4</sup></code>
*   `1 <= words[i].length <= 7`
*   `1 <= pref.length, suff.length <= 7`
*   `words[i]`, `pref` and `suff` consist of lowercase English letters only.
*   At most <code>10<sup>4</sup></code> calls will be made to the function `f`.