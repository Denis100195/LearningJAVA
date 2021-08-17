package QueueStack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/*You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'. The wheels can rotate freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'. Each move consists of turning one wheel one slot.

The lock initially starts at '0000', a string representing the state of the 4 wheels.

You are given a list of deadends dead ends, meaning if the lock displays any of these codes, the wheels of the lock will stop turning and you will be unable to open it.

Given a target representing the value of the wheels that will unlock the lock, return the minimum total number of turns required to open the lock, or -1 if it is impossible.
Example 1:

Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
Output: 6
Explanation:
A sequence of valid moves would be "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202".
Note that a sequence like "0000" -> "0001" -> "0002" -> "0102" -> "0202" would be invalid,
because the wheels of the lock become stuck after the display becomes the dead end "0102".
*/
public class OpenTheLock {
    public int openLock(String[] deadends, String target) {
        HashSet<String> dead_ends = new HashSet<>(Arrays.asList(deadends));
        HashSet<String> visited = new HashSet<>();
        visited.add("0000");

        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");

        int level = 0;

        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                String lockPosition = queue.poll();
                if (dead_ends.contains(lockPosition)){
                    size--;
                    continue;
                }
                if (lockPosition.equals(target)){
                    return level;
                }
                StringBuilder sb = new StringBuilder(lockPosition);
                for (int i = 0; i < 4; i++){
                    char currentPosition = sb.charAt(i);
                    String incr = sb.substring(0, i) + (currentPosition == '9' ? 0 : currentPosition - '0' + 1) + sb.substring(i + 1);
                    String decr = sb.substring(0, i) + (currentPosition == '0' ? 9 : currentPosition - '0' - 1) + sb.substring(i + 1);

                    if (!visited.contains(incr) && !dead_ends.contains(incr)){
                        queue.offer(incr);
                        visited.add(incr);
                    }
                    if (!visited.contains(decr) && !dead_ends.contains(decr)){
                        queue.offer(decr);
                        visited.add(decr);
                    }
                }
                size--;
            }
            level++;
        }

        return -1;
    }
}
