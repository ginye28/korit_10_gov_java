package study.ch19;

import lombok.Getter;

import java.util.Arrays;

//복습

public class SimpleArrayList {                           //<T> new가 들어가서 X
    @Getter
    private String[] strs;

    public SimpleArrayList() {
        strs = new String[0];
    }

    public void add(String str) {                    //마지막 배열에서 하나 추가
        String[] newStrs = new String[strs.length + 1];
        for (int i = 0; i < strs.length; i++) {
            newStrs[i] = strs[i];
        }
        newStrs[strs.length] = str;
        this.strs = newStrs;
    }


    // 크기를 넘어서는 인덱스 위치에 추가는 불가능
    public void add(int index, String str) {
        String[] newStrs = new String[strs.length + 1];

        for (int i = 0; i < strs.length; i++) {
            int currentIndex = i < index ? i : i + 1;       //index가 0이면 +1
            newStrs[currentIndex] = strs[i];
        }
        newStrs[index] = str;
        strs = newStrs;         //빈 index에 추가
    }

//    public void add(int index, String str) {
//        String[] newStrs = new String[strs.length + 1];
//
//        for (int i = 0, currentIndex = i < index ? i : i + 1; i < strs.length; i++) {
//            newStrs[currentIndex] = strs[i];          currentIndex를 newStrs뒤에 넣어도됨
//        }
//        newStrs[index] = str;
//        strs = newStrs;                            //빈 index에 추가
//    }



    public void pop() {                              //마지막 배열에서 -1
        if (strs.length < 1) {                       //배열이 0이면 return
            return;
        }
        String[] newStrs = new String[strs.length - 1];
        for (int i = 0; i < newStrs.length; i++) {
            newStrs[i] = strs[i];
        }
        this.strs = newStrs;
    }

    public void remove(int index) {                  //원하는 인덱스 삭제
        String[] newStrs = new String[strs.length - 1];
        for (int i = 0; i < newStrs.length; i++) {
            int currentIndex = i < index ? i : i + 1;
            newStrs[i] = strs[currentIndex];
        }
        strs = newStrs;

    }
    public void remove(String str) {                //값으로 삭제
        int foundIndex = -1;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(str)) {
                foundIndex = i;
                break;
            }
            if (foundIndex == -1) {
                return;
            }
            remove(foundIndex);
        }
    }
}

class SimpleArrayListMain {
    public static void main(String[] args) {
        SimpleArrayList list = new SimpleArrayList();
        list.add("진혜정");
        list.add("이긴혜정");
        list.add(1, "비긴혜정");
        list.add("진달정");
        System.out.println(Arrays.toString(list.getStrs()));
        list.pop();
        System.out.println(Arrays.toString(list.getStrs()));
        list.add("휴");
        list.add("크롱");
        list.add("코리도라스");
        System.out.println(Arrays.toString(list.getStrs()));
        list.remove(2);
        System.out.println(Arrays.toString(list.getStrs()));
        list.add("휴");
        System.out.println(Arrays.toString(list.getStrs()));
    }
}