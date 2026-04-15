package ex2.view;

import java.util.Map;
import java.util.function.Function;

public interface View {
    void render();
    default void clear() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    default void basicLayout(Map<String, String> props) {
        clear();
        String header = String.format("======<< %s >>======", props.get("title"));
        String body = props.get("body");
        StringBuilder footer = new StringBuilder();
        for (int i = 0; i < header.length(); i++) {
            footer.append("=");
        }
        System.out.println(header);
        System.out.print(body);
        System.out.println(footer);
        System.out.println();
    }
}
