public class Student extends Person{
    String school;

    public Student(String name, int age, String school){
        super(name,age);
        this.school= school;
    }
    public void showInfo(){
        System.out.println("Öğrenci Bilgileri:");
        System.out.println("Ad: " +name);
        System.out.println("Yaş: " +age);
        System.out.println("Okul: " +school );
    }

}
