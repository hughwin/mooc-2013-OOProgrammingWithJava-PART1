
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
            ArrayList<Student> list = new ArrayList<Student>();
    

            String studentName;
            String studentNumber;
            
            
            while (true){
            System.out.println("Enter student's name:");  
            studentName = reader.nextLine();
            if(studentName.equals("")){
                break;
            }
            System.out.println("Enter student's number:"); 
            studentNumber = reader.nextLine();
            list.add(new Student(studentName, studentNumber));
            
            }
            System.out.println(list);
            
            System.out.println("Give search term:");
            String term = reader.nextLine();
            System.out.println("Result:");
            
            for (Student x : list){
                if (x.getName().contains(term) || x.getStudentNumber().contains(term)){
                    System.out.println(x);
                }
            }
    }     
}
