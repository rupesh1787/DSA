import java.util.*;

class FoodRatings {
    private static class Entry {
        String food;
        int rating;
        Entry(String f, int r) { food = f; rating = r; }
    }

    private final Map<String, String> foodToCuisine = new HashMap<>();
    private final Map<String, Integer> foodToRating = new HashMap<>();
    private final Map<String, PriorityQueue<Entry>> cuisineToHeap = new HashMap<>();
    private final Comparator<Entry> cmp = (a, b) -> {
        if (a.rating != b.rating) return b.rating - a.rating;
        return a.food.compareTo(b.food);                     
    };

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodToCuisine.put(food, cuisine);
            foodToRating.put(food, rating);

            cuisineToHeap.computeIfAbsent(cuisine, k -> new PriorityQueue<>(cmp))
                         .offer(new Entry(food, rating));
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        // update current rating map
        foodToRating.put(food, newRating);
        // push a new snapshot entry into the cuisine heap (lazy deletion)
        cuisineToHeap.get(cuisine).offer(new Entry(food, newRating));
    }

    public String highestRated(String cuisine) {
        PriorityQueue<Entry> pq = cuisineToHeap.get(cuisine);
        
        while (!pq.isEmpty()) {
            Entry top = pq.peek();
            int current = foodToRating.get(top.food);
            if (top.rating == current) return top.food;
            pq.poll(); 
        }
        return ""; 
    }
}
