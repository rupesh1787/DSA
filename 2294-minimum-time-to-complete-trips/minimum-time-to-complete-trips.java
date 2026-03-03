class Solution {

    boolean cantrip(int[] time, long mid, int totalTrips) {
        long trips = 0;

        for (int t : time) {
            trips += mid / t;

            if (trips >= totalTrips) {
                return true;   // early stop
            }
        }

        return false;
    }

    public long minimumTime(int[] time, int totalTrips) {

        long minTime = Long.MAX_VALUE;

        for (int t : time) {
            minTime = Math.min(minTime, t);
        }

        long l = 1;
        long r = minTime * totalTrips;   // maximum possible time

        while (l < r) {
            long mid = l + (r - l) / 2;

            if (cantrip(time, mid, totalTrips)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}