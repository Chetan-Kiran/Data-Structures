package ArrayList;
import java.util.*;

public class AlObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Students> list = new ArrayList<>();
        
        System.out.print("Enter No of Students: ");
        int n  = sc.nextInt();

        for(int i=0; i<n; i++){

            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Roll No: ");
            int roll = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Branch: ");
            String branch = sc.nextLine();

            System.out.print("Total Marks: ");
            int total = sc.nextInt();

            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();
            
            list.add(new Students(roll, name, branch, total, cgpa));
        }
        Collections.sort(list, new SortByRollno());

        for(Students i: list){
            i.print();
        }

        sc.close();
    }

    static class Students{
        int roll, total;
        String name, branch;
        double cgpa;

        Students(int roll, String name, String branch, int total, double cgpa){
            this.roll = roll;
            this.name = name;
            this.branch = branch;
            this.total = total;
            this.cgpa = cgpa;
        }
        
        void print(){
            System.out.println(roll + " " + name + " " + branch + " " + total + " " + cgpa);
        }

        //Collections.sort(list, new Students.SortByBranch());
        static class SortByName implements Comparator<Students>{ 
            @Override
            public int compare(Students s1, Students s2){
                return s1.name.compareTo(s2.name);
            }
        }
    }

    static class SortByBranch implements Comparator<Students> {
        @Override
        public int compare(Students s1, Students s2){
            return s1.branch.compareTo(s2.branch);
        }
    }

    static class SortByCgpa implements Comparator<Students>{
        @Override
        public int compare(Students s1, Students s2){
            return Double.compare(s1.cgpa, s2.cgpa);
        }
    }
}

//Comparator is a interface and compare is a predifined method with empty body we have to always over ride the methodes inside the interface when we implement it. 
class SortByRollno implements Comparator<AlObjects.Students>{ 
//try to acess Students class from outside of the AlObjects class so we write AlObjects.Students
    @Override
        public int compare(AlObjects.Students s1, AlObjects.Students s2){
            // if(s1.roll > s2.roll){
            //     return 1;
            // }else if(s1.roll < s2.roll){
            //     return -1;
            // }else{
            //     return 0;
            // }
            return Integer.compare(s2.roll, s1.roll);
        }
    }