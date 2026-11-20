# My Mistakes Diary (Java DSA).

This file is where I write down the mistakes I make and the things I learn while practising Java and DSA. I started it on Nov 7, 2026.

**How I use it**
- After each study day, I add one entry: what went wrong, what I learned, and what to revise.
- Once a week, I read the whole file.
- The rules at the bottom are the mistakes I have repeated, so I read them before every session.

**Goal:** make each mistake only once, and understand the code instead of memorising it.

------------------------------------------------------------------------------------------------
## Day 1 - Nov 7: Find Max, Two Sum, Contains Duplicate
**Mistakes**
- `findMax` didn't handle an empty or `null` array.
- Made two different folders by typing the name differently. File name had a space and a typo.
- Skipped the brute force and went straight to the HashMap.

**Learned**
- Big-O: O(1), O(n), O(n^2), O(log n). Nested loops multiply, loops one after another add.
- Check `arr == null` first, then `arr.length`.
- HashMap = key to value (`Integer`, not `int`). HashSet = have I seen this?
- Two Sum: complement = target - current. Check the map first, then `put`.

**Revise:** write `findMax` and Two Sum from scratch.
-----------------------------------------------------------------------------------------------
## Day 2 - Nov 8: Valid Palindrome, string basics
**Mistakes**
- Forgot `left < right` in loop conditions.
- Wrong brackets when comparing characters.
- Wrote `character` instead of `Character`, `Import` instead of `import`, `TwoSum` instead of `twoSum`, `nums.length()` instead of `nums.length`.

**Learned**
- Last index: `s.length() - 1` for a String, `arr.length - 1` for an array.
- `Character.isLetterOrDigit()` skips spaces and symbols. `Character.toLowerCase()` ignores capitals.
- Skip loops use `while`, not `if`.
- Empty string and a string of only symbols both return `true`.

**Revise:** Valid Palindrome again on Nov 15.
---------------------------------------------------------------------------------------------------
## Day 3 - Nov 9: Prefix sum, LeetCode 1480
**Mistakes / confusion**
- Mixed up the LeetCode version and the normal version with `main`.
- Added the wrong positions when checking a range sum by hand (included position 0).

**Learned**
- LeetCode: class `Solution`, no `main`, method not `static`. Normal program: any class name, with `main`.
- Java forces file name = class name only for `public` classes. I still match them in my own programs.
- Range sum from `l` to `r` = `prefix[r] - prefix[l - 1]`. If `l` is 0, it is `prefix[r]`.
- A running `sum` variable is simpler than `prefix[i - 1]`.
- `result` is just a variable name I choose.

**Revise:** Running Sum from scratch on Nov 12.
--------------------------------------------------------------------------------------------------
## Day 4 - Nov 10: Range Sum, LeetCode 303 (OOP), ArrayList and HashSet
**Mistakes / confusion**
- Wrote `Else` instead of `else`.
- Confused about OOP in LeetCode 303: class, constructor, no `main`.
- Answered "use HashSet" without giving the reason.

**Learned**
- Constructor: same name as the class, no return type. It builds `prefix` once.
- In the constructor write `prefix = new int[...]` with no `int[]` in front, or it becomes a local variable.
- HashSet `contains` is O(1). ArrayList `contains` is O(n).
- ArrayList keeps duplicates and order. HashSet removes duplicates.

**Revise:** LeetCode 303 again from scratch.
---------------------------------------------------------------------------------------------------
## Day 5 - Nov 11: Sliding window, LeetCode 643
**Mistakes / confusion**
- Didn't know how to slide the window without re-adding everything.
- Forgot to save the early warm-up programs to GitHub. Fixed with `FrequencyCount`.
- [any other mistake]

**Learned**
- Sliding window: new sum = old sum + entering number - leaving number. Time O(n).
- LeetCode 643: divide with `(double) maxSum / k`. Start `maxSum` from the first window, not 0.
- Array: `arr.length`, `arr[i]`. ArrayList: `list.size()`, `list.get(i)`, `list.add(x)`.

**Revise:** LeetCode 643 on Nov 18.
-----------------------------------------------------------------------------------------------------
## Day 6 - Nov 12: Binary search, LeetCode 704
**Mistakes / confusion**
- Confused about why `left = mid + 1` and `right = mid - 1`.
- Wrote a method name with a capital letter.
- Mixed up `<` and `<=` in the loop condition.

**Learned**
- Binary search needs a sorted array. Time O(log n).
- `mid` is already checked, so the next area leaves it out: bigger target means `left = mid + 1`, smaller means `right = mid - 1`.
- New way to find mid: `left + (right - left) / 2`. It can't overflow.
- The search ends when `left > right`. Return `-1` if not found.

**Revise:** LeetCode 704 again on Nov 19.
----------------------------------------------------------------------------------------------------
## Day 7 - Nov 13: Recursion, factorial
**Mistakes / confusion**
- Read `factorial(n - 1)` as the number `n - 1`. It is a method call that returns a value.

**Learned**
- Recursion: a method calls itself on a smaller problem.
- Every recursive method needs a base case and a recursive case. No base case causes `StackOverflowError`.
- Tracing habit: write each call on its own line first, then work back up from the base case.

**Revise:** factorial from scratch on Nov 20.
---------------------------------------------------------------------------------------------------
## Day 8 - Nov 14: Weekly test (LeetCode 344, 35, 121)
**Mistakes**
- 344: used `s.length()` on a `char[]`, `int temp` instead of `char temp`, and a missing `}`.
- 35: `while (left < right)` instead of `<=`, and `left++` / `right--` instead of `left = mid + 1` / `right = mid - 1`.
- After editing on LeetCode, I must press Run again before reading the result.

**Learned**
- Two pointers that meet: `left < right`. Binary search: `left <= right`.
- Binary search ends with `left` at the insert position.
- Stock problem: keep `minPrice` and `maxProfit`. Start `minPrice` at `prices[0]` or `Integer.MAX_VALUE`, never 0.
- Declare a variable in the smallest place it is needed.
- Before coding, write 4 lines: input, output, the one rule, the first example by hand.

**Result:** 3 of 3 Accepted.

**Revise:** 35 and 344 on Nov 21.
-------------------------------------------------------------------------------------------------
## Day 9 - Nov 15: Valid Palindrome revisit
**Mistakes**
- Wrote "remove all alphanumeric characters". It is non-alphanumeric. I keep letters and digits and skip the rest.
- The rule line was missing the main idea: the string must read the same forwards and backwards.

**Learned**
- My skip loops now come from me without help. Accepted.
- The method doesn't build a new string, so space is O(1).

**Revise:** Valid Palindrome again on Nov 22.
-------------------------------------------------------------------------------------------------
## Day 10 - Nov 16: Reverse String revisit, linked lists, LeetCode 206
**Mistakes / confusion**
- Read the Reverse String output wrongly. It returns nothing (`void`), and `s` is reversed in place.
- syntax were confusing

**Learned**
- Linked list = nodes with a value and a `next` arrow. The last points to `null`. No `arr[i]`, so I walk from `head`.
- Reverse: save `next`, flip `curr.next = prev`, move `prev` and `curr` forward, return `prev`.
- Save `next` first, or the rest of the list is lost. Time O(n), space O(1).

**Revise:** LeetCode 206 on Nov 23.
-----------------------------------------------------------------------------------------------------
## Day 11 - Nov 17: Stacks, LeetCode 20 Valid Parentheses
**Mistakes / confusion**
- Wondered whether I can just `import java.util.Stack` instead of `ArrayDeque`. Both work. `ArrayDeque` is the one Java recommends.
- the last if block condition i write wrong

**Learned**
- Stack = LIFO. `push`, `pop`, `peek`, `isEmpty`.
- `pop()` on an empty stack crashes, so check `isEmpty()` first.
- Valid Parentheses: push opening brackets, pop and match on closing ones, and the stack must be empty at the end.

**Revise:** LeetCode 20 on Nov 24.
-------------------------------------------------------------------------------------------------
## Day 12 - Nov 18: Queues, first medium (LeetCode 11)
**Mistakes / confusion**
- the question was confusing.

**Learned**
- Queue = FIFO. `add`, `poll`, `peek`, `isEmpty`.
- Container With Most Water: two pointers, move the pointer at the shorter line. Area = min height x width. Time O(n).
- area = (right - left) * Math.min(height[left], height[right]);

**First medium:** needed hint.
**Revise:** LeetCode 11 on Nov 25.
----------------------------------------------------------------------------------------------------
## Day 13 - Nov 19: Binary Search revisit, Group Anagrams
**Mistakes / confusion**
- Group Anagrams was confusing.

**Learned**
- Anagrams give the same word when their letters are sorted, so use the sorted word as the key.
- `HashMap<String, List<String>>`: add an empty list for a new key, then add the word.
- `toCharArray()`, `Arrays.sort()`, `new String(chars)`, `map.values()`.

**Revise:** LeetCode 49 on Nov 26.
-----------------------------------------------------------------------------------------------------
## Day 14 - Nov 20: Group Anagrams explained, Valid Parentheses revisit, Min Stack
**Mistakes / confusion**
- the 2 stack concept confused me
- i couldn't do itt myself

**Learned**
- Min Stack: a second stack keeps the minimums, so `getMin` is O(1). Use `<=` when pushing to it.
- Time O(1) per method, space O(n). It trades extra memory for speed.

**Revise:** LeetCode 155 on Nov 27.

--------------------------------------------------------------------------------------------------

## Rules to remember (read before every session)

1. Two Sum: check the map first, then `put`.
2. Check `null` first, then `length`. Test empty input.
3. Folder and file names: no spaces, no typos, same capitals every time. In my own programs the file name matches the class name. LeetCode files are named after the problem, and the class stays `Solution`.
4. Code goes in `.java` files. `mistakes.md` is for lessons only.
5. Skip loops use `while`, not `if`, and keep `left < right`.
6. Class names start with a capital (`Solution`). Method and variable names start with a lowercase letter (`twoSum`).
7. String: `s.length()`. Array: `arr.length` (no parentheses).
8. Java keywords are lowercase: `if`, `else`, `import`, `class`.
9. LeetCode: submit only the solution class. Keep `main` for my own file.
10. Two pointers that meet: `left < right`. Binary search: `left <= right`.
11. In binary search, jump with `left = mid + 1` and `right = mid - 1`.
12. Before coding, write: input, output, the one rule, the first example by hand.
13. Check `isEmpty()` before `pop()` or `poll()`.
