import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentImplUsingHashset {
    public static void main(String[] args) {
        StudentImplUsingHashset studentImplUsingHashset = new StudentImplUsingHashset();
        Set<Student>students =studentImplUsingHashset.creatingSet();
        studentImplUsingHashset.display(students);
        boolean result=studentImplUsingHashset.removeStudentByRollNo(students,1);
        if (result){
            System.out.println("Student remove");
        }else {
            System.out.println("Student not found");
        }
        studentImplUsingHashset.display(students);
    }
    public Set<Student> creatingSet(){
        Set<Student> students = new HashSet<>();
        students.add(new Student("rishav",21,87));
        students.add(new Student("kunal",32,78));
        students.add(new Student("saurabh",23,68));
        return students;
    }
    public void display(Set<Student> student){
        Iterator<Student> iterator= student.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public boolean removeStudentByRollNo(Set<Student> students,int rollNo){
        boolean response= false;
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getRollNo()==rollNo){
                iterator.remove();
                response=true;
                break;
            }
        }

        return response;
    }
}
