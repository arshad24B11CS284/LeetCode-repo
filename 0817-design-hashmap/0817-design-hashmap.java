class MyHashMap {
    List<List<Integer>> list = new ArrayList<>();
  
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
         for (List<Integer> in : list) {
            if (in.get(0) == key) {
                in.set(1, value); 
                return;
            }
        }

        List<Integer> newPair = new ArrayList<>();
        newPair.add(key);
        newPair.add(value);
        list.add(newPair);
    }
    
    public int get(int key) {
        for(List<Integer> in : list ){
            if(in.get(0) == key){
                return in.get(1);
            }
        }

        return -1;
    }
    
    public void remove(int key) {
       for(int i=0;i<list.size();i++){
        if(list.get(i).get(0) == key){
            list.remove(i);
        }
       }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */