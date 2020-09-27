import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.*;

public class Main {
    public static Map<String,Integer> countWord(String input) {
        String value = input.toLowerCase(); // chuyen chuoi co ky tu in hoa thanh in thuong

        Map<String, Integer> wordMap = new TreeMap<>();

        String[] words = value.split(" ");  // lay cac tu cach nhau bang dau phay.
        System.out.println(words.length);    // Thử tính xem độ dài chuỗi là bao nhiêu




        for (String w : words) {
            if (wordMap.containsKey(w)) {
                int count = wordMap.get(w) +1;
                wordMap.put(w,count);
            }else{
                wordMap.put(w,1);
            }
        }

        
        return wordMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kỳ: ");
        String str = sc.nextLine();

        System.out.println(countWord(str));


    }
}
