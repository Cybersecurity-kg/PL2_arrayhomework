import java.util.*;

public class Practice20_CreateNestedArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> itDept = new ArrayList<>(Arrays.asList("bro1", "bro2", "bro3"));
        ArrayList<String> hrDept = new ArrayList<>(Arrays.asList("dushnila1", "dushnila2"));
        ArrayList<String> salesDept = new ArrayList<>(Arrays.asList("coolguy1", "coolguy2", "coolgirl1"));

        departments.add(itDept);
        departments.add(hrDept);
        departments.add(salesDept);

        System.out.println("Departments (nested ArrayList):");
        for (int i = 0; i < departments.size(); i++) {
            System.out.println("Department #" + (i + 1) + ": " + departments.get(i));
        }
    }
}
