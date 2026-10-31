3881\. Direction Assignments with Exactly K Visible People

Medium

You are given three integers `n`, `pos`, and `k`.

There are `n` people standing in a line indexed from 0 to `n - 1`. Each person **independently** chooses a direction:

*   `'L'`: **visible** only to people on their **right**
*   `'R'`: **visible** only to people on their **left**

A person at index `pos` sees others as follows:

*   A person `i < pos` is visible if and only if they choose `'L'`.
*   A person `i > pos` is visible if and only if they choose `'R'`.

Return the number of possible direction assignments such that the person at index `pos` sees **exactly** `k` people.

Since the answer may be large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** n = 3, pos = 1, k = 0

**Output:** 2

**Explanation:**

*   Index 0 is to the left of `pos = 1`, and index 2 is to the right of `pos = 1`.
*   To see `k = 0` people, index 0 must choose `'R'` and index 2 must choose `'L'`, keeping both invisible.
*   The person at index 1 can choose `'L'` or `'R'` since it does not affect the count. Thus, the answer is 2.

**Example 2:**

**Input:** n = 3, pos = 2, k = 1

**Output:** 4

**Explanation:**

*   Index 0 and index 1 are left of `pos = 2`, and there is no index to the right.
*   To see `k = 1` person, exactly one of index 0 or index 1 must choose `'L'`, and the other must choose `'R'`.
*   There are 2 ways to choose which index is visible from the left.
*   The person at index 2 can choose `'L'` or `'R'` since it does not affect the count. Thus, the answer is `2 + 2 = 4`.

**Example 3:**

**Input:** n = 1, pos = 0, k = 0

**Output:** 2

**Explanation:**

*   There are no indices to the left or right of `pos = 0`.
*   To see `k = 0` people, no additional condition is required.
*   The person at index 0 can choose `'L'` or `'R'`. Thus, the answer is 2.

**Constraints:**

*   <code>1 <= n <= 10<sup>5</sup></code>
*   `0 <= pos, k <= n - 1`