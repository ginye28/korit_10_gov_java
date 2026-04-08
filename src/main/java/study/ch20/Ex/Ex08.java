package study.ch20.Ex;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name, dept; int salary;
    Employee(String name, String dept, int salary) {
        this.name = name; this.dept = dept; this.salary = salary;
    }

    public String getDept() {
        return dept;
    }
}

public class Ex08 {
    public static void main(String[] args) {

        // 데이터:
        // 김(개발팀, 4000), 이(마케팅, 3500), 박(개발팀, 4500),
        // 최(인사팀, 3000), 정(개발팀, 3800)
        // "개발팀" 필터 결과: [김(4000), 박(4500), 정(3800)]
        // 개발팀 평균 연봉: 4100

        List<Employee> emps = List.of(         // 직원 전체
                new Employee("김", "개발팀", 4000),
                new Employee("이", "마케팅", 3500),
                new Employee("박", "개발팀", 4500),
                new Employee("최", "인사팀", 3000),
                new Employee("정", "개발팀", 3800)
        );

//        // 부서별
//        List<Employee> devTeam = new ArrayList<>();
//        for (Employee e : emps) {
//            if (e.dept.equals("개발팀")) devTeam.add(e);
//        }

        List<Employee> devTeam = new ArrayList<>();
        List<Employee> markTeam = new ArrayList<>();
        List<Employee> persTeam = new ArrayList<>();

        for(Employee employee : emps) {
            if("개발팀".equals(employee.getDept())) devTeam.add(employee);
            if("마케팅".equals(employee.getDept())) markTeam.add(employee);
            if("인사팀".equals(employee.getDept())) persTeam.add(employee);
        }

        System.out.println(devTeam);
        System.out.println(markTeam);
        System.out.println(persTeam);

//        List<Employee> persTeam;
//        int i = 0;
//        for (Employee e : devTeam) i += e.salary;
//        i /= devTeam.size();
//        System.out.println("개발팀 연봉 평균: " + i);

    }
}
