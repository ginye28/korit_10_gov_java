package study.ch23;

import lombok.AllArgsConstructor;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


@AllArgsConstructor
class CustomStream<T, R> {
    private List<T> list;

    public List<R> map(Function<T, R> function) {
        List<R> newList = new ArrayList<>();
        for (T data : list) {
            newList.add(function.apply(data));
        }
        return newList;
    }
}

public class Stream01 {
    public static void main(String[] args) {
        //map 반복(치환)
        List<String> strNums = List.of("10", "20", "30");
        List<Integer> nums = new ArrayList<>();
        for (String s : strNums) {
            nums.add(Integer.parseInt(s) * 10);
        }
        System.out.println(nums);

        System.out.println(strNums.stream().map(s -> Integer.parseInt(s) * 10).toList());

        CustomStream<String, Integer> customStream = new CustomStream<>(strNums);
        Function<String, Integer> f = s -> Integer.parseInt(s) * 10;
        List<Integer> nums2 = customStream.map(f);
        System.out.println(nums2);

        CustomStream<String, String> customStream2 = new CustomStream<>(List.of("진혜", "이긴혜", "비긴혜"));
        System.out.println(customStream2.map(name -> "진" + name));

        System.out.println(List.of("진혜", "이긴혜", "비긴혜").stream().map(name -> "진" + name).toList());
    }
}
