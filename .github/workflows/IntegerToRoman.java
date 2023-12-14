import java.util.ArrayList;
import java.util.List;

class main {
    public static void main(String[] args) {
        RomanNumber(105);
    }

    public static void RomanNumber (int num){
        String output = "";
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder sb = new StringBuilder();

        for (int i = values.length-1; i >= 0 && num > 0; i--){
          while (num >= values[i]){
            num -= values[i];
            sb.append(roman[i]);
          }  
        }
        System.out.println(sb.toString());
    }

     

}