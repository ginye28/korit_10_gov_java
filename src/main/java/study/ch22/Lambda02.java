package study.ch22;


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda02 {
    public static void main(String[] args) {

        Runnable r = () -> {      //실행문에 쓰임 (스레드)
            int i = 0;
            while (i < 10) {
                System.out.println(i);
                i++;
            }
        };

        Consumer<String> c1 = str -> System.out.println("문자열: " + str);      //소비자 return X
        Consumer<List<Integer>> c2 = numList -> {
            for (Integer i : numList) {
                System.out.println("i: " + i);
            }
        };

        c2.accept(List.of(10, 20, 30, 40));
        c1.accept("진혜정");
        r.run();

        Supplier<Character> s1 = () -> {
            System.out.println("Supplier 객체 호출");
            String str = "abcd";
            return str.charAt(0);
        };

        Supplier<Character> s2 = () -> "abcd".charAt(0);

        System.out.println(s1.get());
        System.out.println(s2.get());

        String name = "진혜정";        //지역에 있는 걸 가져다 쓸 수 있음
        Supplier<Character> s3 = () -> {
            System.out.println(name);
            return name.charAt(0);
        };
        System.out.println(s3.get());

        Function<String, Integer> intParser = strData -> {
            Integer numData = Integer.parseInt(strData);
            return numData;
        };
        System.out.println(intParser.apply("1000") + 200);

        Predicate<String> p = n -> "진혜정".equals(n);
        System.out.println(p.test("진혜정"));
    }
}
