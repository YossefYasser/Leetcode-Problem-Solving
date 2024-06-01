class RecentCounter {
    int counter;
    ArrayList<Integer> result = new ArrayList<>();
     ArrayList<Integer> requests = new ArrayList<>();

    public void RecentCounter() {
        counter =0;
        
    }
    
    public int ping(int t) {

        if ( t>0)
        {
            requests.add(t);
            this.RecentCounter();
           
        }
        
        for ( int x : requests)
        {
            if( x <= t && x >= t-3000)
            {counter++;}
        }

        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */