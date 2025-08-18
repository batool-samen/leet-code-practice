class Solution {
    public int climbStairs(int n) {

      
     if(n<=2)
            return n;
        
     int [] myArray= new int [n+1];
     myArray[1]=1;
     myArray[2]=2;
   

     for(int i=3;i<=n;i++){

        myArray[i] =myArray[i-1]+myArray[i-2];
     }
     return myArray[n];
 
    }

}