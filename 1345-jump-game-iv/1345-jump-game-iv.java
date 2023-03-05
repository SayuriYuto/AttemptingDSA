class Solution {
  public int minJumps(int[] arr) {
    int n = arr.length, steps = 0;
    HashMap < Integer, List < Integer >> hm = new HashMap < > ();
    Queue < Integer > q = new LinkedList < > ();
    boolean visited[] = new boolean[n];
    for (int i = 0; i < n; i++) {
      if (!hm.containsKey(arr[i])) {
        List < Integer > ls = new ArrayList < > ();
        ls.add(i);
        hm.put(arr[i], ls);
      } else {
        hm.get(arr[i]).add(i);
      }
    }
    q.add(0);
    visited[0] = true;
    while (!q.isEmpty()) {
      int size = q.size();
      while (size--> 0) {
        int cur = q.poll();
        if (cur == n - 1) return steps;
        int left = cur - 1;
        int right = cur + 1;
        if (left >= 0 && !visited[left]) {
          q.add(left);
          visited[left] = true;
        }
        if (right < n && !visited[right]) {
          q.add(right);
          visited[right] = true;
        }
        List < Integer > indecesToJump = hm.get(arr[cur]);
        indecesToJump.add(cur - 1);
        indecesToJump.add(cur + 1);
        for (int val: hm.get(arr[cur])) {
          if (val >= 0 && val < n && !visited[val]) {
            q.add(val);
            visited[val] = true;
          }
        }
        indecesToJump.clear();
      }
      steps++;
    }
    return -1;
  }
}