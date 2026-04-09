package study.ch22;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda03 {
    public static String search(List<String> list, Predicate<String> p) {
        for (String s : list) {
            if (p.test(s)) return s;
        }
        return null;
    }

    public static void applicationMain(Runnable runnable) {
        System.out.println("프로그램 시작");
        runnable.run();
        System.out.println("프로그램 종료");
    }

    public static List<Integer> createNumListOfRange(int multNum, Function<Integer, List<Integer>> f) {  //2
        return f.apply(multNum);     //3
    }

    public static void main(String[] args) {
        String searchName = "이긴혜정";
        List<String> names = List.of("진혜정", "이긴혜정", "비긴혜정");
        String foundName = search(names, name -> name.equals(searchName));
        System.out.println(foundName);

        applicationMain(() -> {
            List<Integer> numList = createNumListOfRange(10, (multNum) -> {     //1 돌아옴
                int start = 10;
                int end = 20;
                List<Integer> nums = new ArrayList<>();
                for (int i = start; i < end + 1; i++) {
                    nums.add(i * multNum);
                }
                return nums;
            });
            System.out.println(numList);
        });
        System.out.println("프로그램 완전 종료");
    }
}