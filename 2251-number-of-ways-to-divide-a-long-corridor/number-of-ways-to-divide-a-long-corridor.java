class Solution {
    public int numberOfWays(String corridor) {
        long MOD = 1_000_000_007;

        int totalSeats = 0;
        for (char c : corridor.toCharArray()) {
            if (c == 'S') totalSeats++;
        }

        if (totalSeats < 2 || totalSeats % 2 == 1) return 0;

        long ways = 1;
        int seatCount = 0;
        int plantCount = 0;

        for (char c : corridor.toCharArray()) {
            if (c == 'S') {
                seatCount++;

                // when starting a new section (after first section)
                if (seatCount == 3) {
                    ways = (ways * (plantCount + 1)) % MOD;
                    plantCount = 0;
                    seatCount = 1; // current 'S' starts next section
                }
            } else { // 'P'
                if (seatCount == 2) {
                    plantCount++;
                }
            }
        }

        return (int) ways;
    }
}
