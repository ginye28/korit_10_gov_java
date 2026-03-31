package study.ch08;

public class OBJ01 {
    public static void main(String[] args) {
        /**
         * 100명의 학생정보를 저장하세요.
         * 이름, 나이
         */
        class 학생 {
            String 이름;
            int 나이;

            void printInfo() {
                System.out.println("name: " + 이름);
                System.out.println("age: " + 나이);
            }

            void increaseAge() {
                System.out.println("나이 한 살 더 먹기");
                나이++;
            }
        }

        학생 학생1 = new 학생();
        학생1.이름 = "진혜정";
        학생1.나이 = 21;
        학생1.printInfo();
        학생1.increaseAge();
        학생1.printInfo();
        학생1.printInfo();

        학생 학생2 = new 학생();
        학생2.이름 = "이긴혜정";
        학생2.나이 = 22;
    }
}
