import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class _String {

  public static void main(String[] args) {

    // building a array of boolean Data Type :
    Boolean[] cars = new Boolean[4];
    Arrays.fill(cars, true);
    System.out.println(Arrays.toString(cars));

    // STRING STARTS HERE //length of string can be change in java like js ;

    String bag = "ab5cde";
    bag += 4;
    System.out.println(bag.charAt(4)); // characterAt
    // .codePoint
    System.out.println(bag.codePointAt(4)); // ascii code {unicode}
    System.out.println(bag.codePointBefore(1)); // unicode for previous index or the element before the specified index
    System.out.println(bag.codePointCount(0, 6)); // returns the number of the unicode found in a string

    String carName = "mahindraCar";
    // compareTo()

    System.out.println(bag.compareTo(carName)); // return 0 -ve and +ve => 97-109

    System.out.println(carName.compareTo(bag)); // return 0 -ve and +ve => 109-97

    System.out.println(carName.compareToIgnoreCase(bag)); // ignoring case sensitivity of characters in string
    // lexicographically -> first converts to lowerCase

    // .concat()
    System.out.println(bag.concat(carName)); // return -> string

    System.out.println(bag.contains("d")); // 'd' / a this is wrong
    System.out.println(carName.contains("mahindra")); // returns a boolean

    boolean x = bag.equals(carName); // Value/Content //same .equalsIgnoreCase();
    boolean y = bag.contentEquals(carName); // Value/Content
    String a = "a";
    String b = "a";
    boolean z = (a == b); // Memory Address : Java looks into a special memory area called the String
                          // Pool. It sees "a" isn't there, so it creates it.
    System.out.println(x + "" + y + "" + z);

    // copyValueOf -> Returns the string from array of char upon the range you
    // specify ;
    char[] CharArr = { 'a', 'f', 'g' };
    String copiedString = String.copyValueOf(CharArr, 0, 1);
    // exclude final range //will throw Boundation warning
    System.out.println(copiedString);

    // ends with str.endsWith('d');
    System.out.println(carName.endsWith("S")); // return boolean

    // format() Returns a formatted string using the specified locate, format string
    // and arguments

    String myStr = "Hello %s! One kilobyte is %,d bytes.";
    String result = String.format(myStr, "World", 1024);
    System.out.println(result);

    byte[] res = myStr.getBytes();

    System.out.println(res[0]); // string -> byte[]

    // hashCode()
    System.out.println("this".hashCode());

    // str.isEmpty()
    System.out.println("".isEmpty()); // true

    // str.join(str2)
    System.out.println(String.join(" ", "string2", "string3"));

    // takes seprated and elements as argument . -> return new string specified by
    // sepraters.
    // str.matches(regex) ;

    // String myStr = ;
    System.out.println("Hello, World!".substring(7, 12)    +""+"Hello, world".indexOf("w")+" "+"Hello, world".indexOf("d") );
    //Returns

  }

}
