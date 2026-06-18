public class ClassStart4 {

  public static void main(String[] args) {
    Student student1 = new Student();
    student1.name = "학생1";
    student1.age = 15;
    student1.grade = 90;

    Student student2 = new Student();
    student2.name = "학생2";
    student2.age = 16;
    student2.grade = 80;

    Student[] students = new Student[2];
    students[0] = student1;
    students[1] = student2;

    System.out.println("이름 : " + students[0].name + ", 나이 : " + students[0].age + ", 성적 : " + students[0].grade);
    System.out.println("이름 : " + students[1].name + ", 나이 : " + students[1].age + ", 성적 : " + students[1].grade);


    System.out.println(students[0] == student1); // true
    System.out.println(students[1] == student1); // false
    System.out.println(students[1] == student2); // true
    System.out.println(students[0] == student2); // false
    // 주소값을 참조하므로 student1의 데이터를 수정하면 students[0]의 데이터도 수정된다.
    student1.name = "학생1에서 학생3으로 데이터 수정";
    System.out.println("이름 : " + students[0].name + ", 나이 : " + students[0].age + ", 성적 : " + students[0].grade);

  }
}
