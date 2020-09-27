import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.*;

public class Main {
    public static Map<String,Integer> countWord(String input) {
        String value = input.toLowerCase(); // chuyen chuoi co ky tu in hoa thanh in thuong

        Map<String, Integer> wordMap = new TreeMap<>();

        String[] words = value.split(" ");  // lay cac tu cach nhau bang dau phay.
        System.out.println(words.length);



        for (String w : words) {
            if (wordMap.size() == 0) {
                wordMap.put(w,1);
            }
            else {
                for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {

                    if (w.equals(entry.getKey())) {
                        int count = entry.getValue() + 1;
                        entry.setValue(count);
                    }
                    wordMap.put(w,1);
                }
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
