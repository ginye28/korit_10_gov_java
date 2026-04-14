package study.ch27;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional01 {
    public static void main(String[] args) {

        List<Optional<String>> optionals =
                new ArrayList<>(Arrays.asList(new String[] {"김", null, "진", null})).stream()
                        .map(lastName -> Optional.ofNullable(lastName))
                        .toList();

        optionals.forEach(opt -> {
            String n1 = opt.orElse("박");

            String n2 = opt.or(() -> {
                System.out.println("추가 로직");
                return Optional.of("박");
            }).get();

            String n3 = opt.orElseGet(() -> "박");

            String n4 = opt.orElseThrow();
            String n5 = opt.orElseThrow(() -> new RuntimeException());
        });
        //Optional 생성
        Optional<String> name = Optional.of("이긴혜정");
        System.out.println(name.orElse("진혜정"));
        List.of("").stream().findFirst().get();
    }
}