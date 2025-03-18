// Separate Chaining

// ✅ Handles collisions well even if table is full.
// ✅ Scales well with large datasets.
// ❌ Uses extra memory for LinkedLists.
// ❌ Lookups slow down if too many elements collide.

class MyHashSet {
    private static final int SIZE = 1000;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[SIZE];
    }

    private int hash(int key){
        return key % SIZE;
    }
    
    public void add(int key) {
        int index = hash(key);

        if(buckets[index] == null){
            buckets[index] = new LinkedList<>();
        }

        if(!buckets[index].contains(key)){
            buckets[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index = hash(key);
        
        if(buckets[index] != null){
            buckets[index].remove((Integer) key);
        }
        
    }
    
    public boolean contains(int key) {
        int index = hash(key);

        return buckets[index] != null && buckets[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */