//good string ->> no consecutive letter  ,you need to convert it to good 
// console.log(badStrToGoodStr("aabbccsppdd"));  //output : abcspd 

public class Good_Bad_Strings {
   public static void main(String[] args) {

      // way one using two pointer N
      String str = "aabbccsppdd";
      StringBuilder bag = new StringBuilder();
      int n = str.length();

      for (int i = 0; i < n; i++) {
         if ((i + 1) == n) {
            bag.append(str.charAt(i));
         } else if (str.charAt(i) != str.charAt(i + 1)) {
            bag.append(str.charAt(i));
         }

      } // N

      System.out.println(bag.toString());

      // way 2 using hasmap N time +space
      // waste N tc for converting to hasmap N space complexity
      // agan bag will be initilized and a for each loop for appending key to the bag
      // //

   }
}
