import java.util.Arrays;
import java.util.Comparator;

public class Code08 {

    public  static  class Student{
        int id;
        int age;
        String name;

        public Student(int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public  static  class  IdAscendingComparator implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return o1.id-o2.id;

        }
    }


    public static void main(String[] args) {
        Student s1 = new Student(1, 18, "zzx");
        Student s2 = new Student(2, 22, "asdzxcx");
        Student s3 = new Student(3, 34, "zczxcx");
        Student[] s=new Student[]{s3,s2,s1};
        System.out.println(Arrays.toString(s));
        Arrays.sort(s,new IdAscendingComparator());
        System.out.println(Arrays.toString(s));







    }
}
