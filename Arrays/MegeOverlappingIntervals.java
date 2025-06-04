class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        List<int[]> result = new ArrayList<>();
        
        if(arr==null || arr.length<0){
            return result;
        }
        
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int start = arr[0][0], end = arr[0][1];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i][0] <= end){
                end =Math.max(end,arr[i][1]);
                
            }else{
                result.add(new int[]{start,end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }
            result.add(new int[]{start,end});
            return result;
    }
}
