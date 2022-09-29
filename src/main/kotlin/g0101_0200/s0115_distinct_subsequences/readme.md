115\. Distinct Subsequences

Hard

Given two strings `s` and `t`, return _the number of distinct subsequences of `s` which equals `t`_.

A string's **subsequence** is a new string formed from the original string by deleting some (can be none) of the characters without disturbing the remaining characters' relative positions. (i.e., `"ACE"` is a subsequence of `"ABCDE"` while `"AEC"` is not).

The test cases are generated so that the answer fits on a 32-bit signed integer.

**Example 1:**

**Input:** s = "rabbbit", t = "rabbit"

**Output:** 3

**Explanation:** As shown below, there are 3 ways you can generate "rabbit" from s. <code>**<ins>rabb</ins>**b**<ins>it</ins>**</code> <code>**<ins>ra</ins>**b**<ins>bbit</ins>**</code> <code>**<ins>rab</ins>**b**<ins>bit</ins>**</code>

**Example 2:**

**Input:** s = "babgbag", t = "bag"

**Output:** 5

**Explanation:** As shown below, there are 5 ways you can generate "bag" from s. <code>**<ins>ba</ins>**b<ins>**g**</ins>bag</code> <code>**<ins>ba</ins>**bgba**<ins>g</ins>**</code> <code><ins>**b**</ins>abgb**<ins>ag</ins>**</code> <code>ba<ins>**b**</ins>gb<ins>**ag**</ins></code> <code>babg**<ins>bag</ins>**</code>

**Constraints:**

*   `1 <= s.length, t.length <= 1000`
*   `s` and `t` consist of English letters.