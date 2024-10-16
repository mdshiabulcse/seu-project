package collectioncustometype;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomListMain {
    public static void main(String[] args) {

        /*
         * Collection framework program
         * 1.Declare array list
         * 2.Data insert
         * 3.Data update
         * 4.Data short
         * 5.Data remove
         * 6.Data view
         * */
        //Array list declare
        ArrayList<Employee>employees=new ArrayList<>();


        Employee e1= new ArrayList(
                "A",
                "Software Engineer",
                50000,
                new String[]{"C++","SQL","Angular JS"}

        );

        Employee e2= new ArrayList(
                "B",
                "UI/UX Engineer",
                50000,
                new String[]{"HTML","CSS","Angular JS"}

        );
        Employee e3= new ArrayList(
                "C",
                "Mobile App Developer",
                150000,
                new String[]{"Swift","SQlite","Angular JS"}

        );

        Employee e4= new ArrayList(
                "D",
                "DevOps",
                300000,
                new String[]{"Ci/CD","Server Script","C++"}

        );

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        //print
        printInformation(employees);

        //for update e1 information
        for (Employee e: employees) {
            if (e.getName().eqquals("A")){
                e.setDesignation("Sr. Software Engineer");
                e.salary(60000);
                break;
            }
        }

    }

    public static void printInformation(ArrayList<Employee> employees){
        for(Employee data:employees){
            String skill="";
            for (String s : e)
            System.out.println(String.format(
                    "Employee name: %s,Employee desgnation: %s,Employee Slary:: %d,Employee Skill: %s",
                    e.getName(),e.getDesignation,e.getSalary(),skill
            ));
        }
        System.out.println();
    }
}
