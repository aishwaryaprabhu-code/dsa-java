# When to use what

| If the problem has... | Try this | Example I solved |
|---|---|---|
| A pair, or the complement of a number | HashMap (number to index) | Two Sum |
| "Have I seen this before?" or duplicates | HashSet | Contains Duplicate |
| Count how often each thing appears | HashMap or a 26-box array | Frequency Count, Valid Anagram |
| Group things by a shared label | HashMap with a list as the value | Group Anagrams |
| Sorted array, find a pair or a target | Two pointers (`left`, `right`) | Two Sum II |
| Palindrome, reverse, compare both ends | Two pointers moving inward | Valid Palindrome, Reverse String |
| Sorted array, find a value or insert spot | Binary search (`left <= right`) | Binary Search, Search Insert Position |
| Sum of a range, asked many times | Prefix sum | Range Sum Query |
| Best sum or average of `k` numbers in a row | Sliding window | Maximum Average Subarray |
| Matching brackets, last opened closes first | Stack | Valid Parentheses |
| Need the minimum instantly | A second helper stack | Min Stack |
| Process in order of arrival | Queue | Queue using Stacks |
| Chain of nodes, reverse or walk it | `prev`, `curr`, `next` | Reverse Linked List |.
| A tree, and a node needs info from both children | Recursion with the base case `null` | Maximum Depth of Binary Tree|
| The same action at every node of a tree | Recursion with the base case `null`| Invert Binary Tree |
| Compare two trees node by node | Recursion on both trees together, with `null` checks first | Same Tree |
| Check if a tree is a mirror of itself | A helper method on two nodes, crossing left with right | Symmetric Tree |
