import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[]numbers={11,12,-13,14,15,-16,17,-18,19,-20};
        int[]multiplication= Arrays.stream(numbers).filter(num->num>0).toArray();
       // System.out.println(Arrays.toString(multiplication));

        List<Integer>numberList=List.of(1,2,3,4,5,6,7,8,9);
        List<Integer>streamList=numberList.stream().map(i->i*2).toList();
      //  streamList.forEach(System.out::println);

        List<String>names=List.of("asan","uson","batma","zuura");
        List<String>namesStream=names.stream().map(t->t.substring(0,1).toUpperCase()).toList();
        //namesStream.forEach(System.out::println);

        Set<String> stringSet=names.stream().map(String::toUpperCase).collect(Collectors.toSet());
        //stringSet.forEach(System.out::println);

        List<Integer>integers=List.of(45,47,36,8954,476,1235);
        List<Integer>integersStream=integers.stream().filter(x->x%2==0).toList();
       // integersStream.forEach(System.out::println);

        Student student1=new Student("Aiperi","Satybaldieva",19,Gender.FEMALE,10000);
        Student student2=new Student("Jazgul","Asanova",20,Gender.FEMALE,20000);
        Student student3=new Student("Bakyt","Jusuev",35,Gender.MALE,0);
        Student student4=new Student("Asan","Tagaev",37,Gender.MALE,60000);
        Student student5=new Student("Nazima","Aldieva",18,Gender.FEMALE,50000);

        List<Student>students=new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5));
        List<Student>streamStudent=students.stream().filter(s->s.getFirstName().startsWith("A")).toList();
       // streamStudent.forEach(System.out::println);

        List<Student>streamAgeMoney=students.stream().filter(a->a.getAge()>15&&a.getPrice()>0).toList();
        //streamAgeMoney.forEach(System.out::println);

        List<Student>streamMoney=  students.stream().max(Comparator.comparing(Student::getPrice)).stream().toList();
       // streamMoney.forEach(System.out::println);

        List<Student>streamRichGirl=students.stream().filter(m->m.getGender().equals(Gender.FEMALE)).
                max(Comparator.comparing(Student::getPrice)).stream().toList();
        //streamRichGirl.forEach(System.out::println);

        List<Double> streamAllStudents=students.stream().map(m->m.getPrice()+1000).toList();
      // streamAllStudents.forEach(System.out::println);

       List<Student>streamFirst=students.stream().findFirst().stream().toList();
       //streamFirst.forEach(System.out::println);

       long streamLength=students.stream().count();
       // System.out.println(streamLength);

        List<Student>boyStream=students.stream()
                .filter(student -> student.getGender().equals(Gender.MALE)).toList();
       // boyStream.forEach(System.out::println);

        List<Student>girlStream=students.stream()
                .filter(student -> student.getGender().equals(Gender.FEMALE)).toList();
        girlStream.forEach(System.out::println);

    }
}