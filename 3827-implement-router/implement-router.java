import java.util.*;

class Router {

    private int memoryLimit;
    private Deque<int[]> q;
    private Set<String> seen;
    private Map<Integer, List<Integer>> destMap;

    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
        this.q = new LinkedList<>();
        this.seen = new HashSet<>();
        this.destMap = new HashMap<>();
    }
    
    public int findLeft(List<Integer> lst, int x) {
        int lo = 0;
        int hi = lst.size();
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (lst.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public int findRight(List<Integer> lst, int x) {
        int lo = 0;
        int hi = lst.size();
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (lst.get(mid) <= x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public void insert(List<Integer> lst, int x) {
        int idx = findLeft(lst, x);
        lst.add(idx, x);
    }
    
    public boolean addPacket(int source, int destination, int timestamp) {
        String key = String.format("%d,%d,%d", source, destination, timestamp);
        if (seen.contains(key)) {
            return false;
        }

        if (seen.size() == memoryLimit) {
            int[] oldestPacket = q.pollFirst();
            int s0 = oldestPacket[0];
            int d0 = oldestPacket[1];
            int t0 = oldestPacket[2];
            seen.remove(String.format("%d,%d,%d", s0, d0, t0));

            List<Integer> timestamps = destMap.get(d0);
            int i0 = findLeft(timestamps, t0);
            timestamps.remove(i0);
            if (timestamps.isEmpty()) {
                destMap.remove(d0);
            }
        }

        q.addLast(new int[]{source, destination, timestamp});
        seen.add(key);

        List<Integer> timestampsList = destMap.computeIfAbsent(destination, k -> new ArrayList<>());
        insert(timestampsList, timestamp);
        return true;
    }
            
    public int[] forwardPacket() {
        if (q.isEmpty()) {
            return new int[0];
        }
        int[] packet = q.pollFirst();
        int s = packet[0];
        int d = packet[1];
        int t = packet[2];
        seen.remove(String.format("%d,%d,%d", s, d, t));

        List<Integer> timestampsList = destMap.get(d);
        int i = findLeft(timestampsList, t);
        timestampsList.remove(i);
        if (timestampsList.isEmpty()) {
            destMap.remove(d);
        }
        return packet;
    }

    public int getCount(int destination, int startTime, int endTime) {
        if (!destMap.containsKey(destination)) {
            return 0;
        }
        List<Integer> timestampsList = destMap.get(destination);
        int lo = findLeft(timestampsList, startTime);
        int hi = findRight(timestampsList, endTime);
        return hi - lo;
    }
}