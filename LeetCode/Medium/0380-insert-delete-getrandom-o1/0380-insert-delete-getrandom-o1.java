class RandomizedSet {
    HashMap<Integer,Integer> map ;
    ArrayList<Integer> list ;
    Random rand= new Random();
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();

    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return  false;
        map.put(val,list.size());
        list.add(val);
        return  true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int ind = map.get(val);
        if(ind!=list.size()-1){
            int last = list.get(list.size()-1);
            map.put(last,ind);
            list.set(ind,last);
        }
        map.remove(val);
        list.remove(list.size()-1);
        return true;
    }
    
    public int getRandom() {
        int ran=rand.nextInt(0,list.size());
        return list.get(ran);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */