package streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/3/21 11:59 上午
 */
public class CountLongWords {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("./test.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        long count = 0;
        for (String w : words){
            if (w.length() > 12) count++;
        }
        System.out.println(count);

        count = words.stream().filter(w -> w.length() > 12).count();
        System.out.println(count);

        count = words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(count);

    }

    public static Stream<String> letters(String s){
        List<String> result = new ArrayList<>();
        for (int i =0; i < s.length(); i++){
            result.add(s.substring(i, i + 1));
        }
        return result.stream();
    }
}
