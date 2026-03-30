// Goal> to console yes if arr can be modified into all zeroes otherwise no 
//  operation "you can subtract ith -1 and i+1th -1"


//brute force => {O(N^2)}
//   for(int i =0; i<n-1; i++){
    
//     while(arr[i] > 0){
//     if(arr[i+1] > 0 )
//     arr[i]-= 1;
//     arr[i+1]-=1;
//     }else{
//         // break failed//  
//     }
//   }
// return arr[n-1]==0 ; 

//O(N)=> 

// int n = arr.size();
//     for (int i = 0; i < n - 1; i++) {
//         if (arr[i] < 0) return false; // Safety check
//         if (arr[i] > arr[i+1]) return false; // Cannot zero out arr[i]
        
//         arr[i+1] -= arr[i]; // Use neighbor to cancel current
//         arr[i] = 0;
//     }
//     // The very last element must end up as 0
//     return arr[n-1] == 0;


