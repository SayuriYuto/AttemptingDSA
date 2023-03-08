class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        var min = 1;
        var max = maxValue(piles);

        // special case - if we only have n hours to eat bananas from n piles, 
        // we obviously need to be able to eat the biggest pile in one hour
        if (h == piles.length) return max;

        // here the binary search starts: 
        // we test options between max and min speed, 
        // see how resulting hours relate to our target 
        // and move max and min values accordingly - 
        // until they finally match
        while (max != min) {
            int testSpeed = min + (max - min) / 2;
            int hours = getHours(piles, testSpeed);
            if (hours > h) {
                // we are too slow! our new minimum speed should be higher
                min = testSpeed + 1;
            }
            if (hours <= h) {
                // no need to eat faster, so this testSpeed becomes our new maximum
                max = testSpeed;
            }
        }

        return min;
    }

    // get maximum element in the array
    private int maxValue(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // calculate how many eating hours we need at a given speed
    private int getHours(int[] piles, int speed) {
        int hours = 0;
        for (int count : piles) {
            hours += count / speed + (count % speed > 0 ? 1 : 0); 
        }
        return hours;
    }
}