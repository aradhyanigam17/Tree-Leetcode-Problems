class Solution {
   class Pair{
        String val;
        int freq;
             Pair(String val, int freq){
                 this.val=val;
                 this.freq=freq;
             }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            if(a.freq!=b.freq){
                return a.freq-b.freq;
            }
            return b.val.compareTo(a.val);
        });
        for(String key : map.keySet()){
            if(pq.size()<k){
                pq.add(new Pair(key,map.get(key)));
            }else{
                if(pq.peek().freq<map.get(key)){
                    pq.remove();
                    pq.add(new Pair(key,map.get(key)));
                }else if(pq.peek().freq==map.get(key)){
                     pq.add(new Pair(key,map.get(key)));
                    }
                }
            }
            while(pq.size()>k){
                pq.remove();
            }
        List<String>ans=new ArrayList();
        while(pq.size()>0){
            ans.add(0,pq.remove().val);
        }
        return ans;





    }
}