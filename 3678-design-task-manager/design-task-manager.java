import java.util.*;

class TaskManager {
    private static class Task {
        int userId, taskId, priority;
        Task(int u, int t, int p) {
            userId = u; taskId = t; priority = p;
        }
    }

    private final Map<Integer, Task> taskMap; // taskId -> latest Task snapshot
    private final PriorityQueue<Task> pq;     // max-heap of snapshots

    public TaskManager(List<List<Integer>> tasks) {
        taskMap = new HashMap<>();
        pq = new PriorityQueue<>((a, b) -> {
            if (b.priority != a.priority) return Integer.compare(b.priority, a.priority);
            return Integer.compare(b.taskId, a.taskId);
        });

        for (List<Integer> t : tasks) {
            add(t.get(0), t.get(1), t.get(2));
        }
    }

    public void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        taskMap.put(taskId, task);
        pq.offer(task);
    }

    public void edit(int taskId, int newPriority) {
        Task old = taskMap.get(taskId);
        if (old != null) {
            Task updated = new Task(old.userId, taskId, newPriority);
            taskMap.put(taskId, updated);
            pq.offer(updated); // push fresh snapshot
        }
    }

    public void rmv(int taskId) {
        taskMap.remove(taskId); // lazy removal; outdated snapshots remain in heap
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            Task top = pq.peek();
            Task valid = taskMap.get(top.taskId);
            // validate both priority AND userId to ensure snapshot corresponds to current task
            if (valid == null || valid.priority != top.priority || valid.userId != top.userId) {
                pq.poll(); // stale snapshot, discard
                continue;
            }
            pq.poll();
            taskMap.remove(top.taskId);
            return top.userId;
        }
        return -1;
    }
}

