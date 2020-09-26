import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.*;

public class Main {
    public static Map<String,Integer> countWord(String input) {
        String value = input.toLowerCase(); // chuyen chuoi co ky tu in hoa thanh in thuong

        Map<String, Integer> wordMap = new TreeMap<>();

        String[] words = value.split(" ");  // lay cac tu cach nhau bang dau phay.
        System.out.println(words.length);
        int count = 1;
        for (String w : words ) {
//            Set<String> keySet = wordMap.keySet();
            if (wordMap.isEmpty()) {
                wordMap.put(w,count);
            }else {
                for (Map.Entry<String,Integer> entry : wordMap.entrySet()) {
                    if (entry.getKey().equals(w)){
                        wordMap.replace(w, entry.setValue(count++));
                    }
                    else {
                        wordMap.put(w,count);
                    }
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
