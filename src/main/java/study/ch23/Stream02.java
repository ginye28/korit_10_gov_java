package study.ch23;

import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(10,20,30,40); //스트림은 한 번밖에 못 씀

        Stream<Integer> numStream2 = numStream.map(num -> num * 10);

        Stream<Integer> numStream3 = numStream2.filter(num -> num % 3 != 0);    //filter

        System.out.println(numStream3.toList());
    }
}