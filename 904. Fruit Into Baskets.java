class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        
        //if it less than or equal to 2 there will be no more elements
        if(n<3 ) return n;
        
        //store the count of fruits
        int[] count = new int[n];
        
        //maximum count can achive in basket
        int max = 0;
        int typeCount = 0;
        
        //from where we can start the plucking
        int j = 0;
        
        
        for(int i = 0; i < fruits.length; i++) {
            
            //at max 2 type will be allowed
            if(count[fruits[i]]==0) typeCount++;
            count[fruits[i]]++;
            
            
            while(j<i && typeCount>2){
                      
                count[fruits[j]]--;
                //when ever the element zero it wont be in basket
                if(count[fruits[j]]==0) typeCount--;
                j++;
            }
    
            max=Math.max(max,i-j+1);
            
        }
        
        return max;
    }
}