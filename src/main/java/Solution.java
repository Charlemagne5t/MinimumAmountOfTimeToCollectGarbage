public class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        boolean mIsPresent = false;
        boolean pIsPresent = false;
        boolean gIsPresent = false;

        int sum = 0;
        for (int i = garbage.length - 1; i >= 0; i--) {
            if (mIsPresent && pIsPresent && mIsPresent) {
                sum += garbage[i].length();
                if (i != 0) {
                    sum += travel[i - 1] * 3;
                }
                continue;
            }
            for (int j = 0; j < garbage[i].length(); j++) {
                char curGarbage = garbage[i].charAt(j);
                if (curGarbage == 'M') {
                    mIsPresent = true;
                } else if (curGarbage == 'P') {
                    pIsPresent = true;
                } else if (curGarbage == 'G') {
                    gIsPresent = true;
                }
                sum++;
            }

            if (mIsPresent && i != 0) {
                sum += travel[i - 1];
            }
            if (pIsPresent && i != 0) {
                sum += travel[i - 1];
            }
            if (gIsPresent && i != 0) {
                sum += travel[i - 1];
            }
        }
        return sum;
    }
}
