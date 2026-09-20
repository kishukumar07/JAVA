class Solution {
    public int reverseDegree(String s) {
        

    int sum =0; 
    int n = s.length(); 

    for(int i=0; i<n; i++){
        sum +=  ((i+1) *    (27 -   (s.charAt(i) -'a')-1 ) );     
        //  System.out.println(sum);     

    }


return sum ; 


    }
}

//resoning reverse alpha series  
// a = 97 - 97  => 0 + 1  => 1  => 27 - 1 => 26   
// z = 122  - 97 = > 25 +1  => 26  => 27- 26   => 1  
