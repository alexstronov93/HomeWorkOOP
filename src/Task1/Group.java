package Task1;

public class Group {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alex", 20),
                new Student("Boris", 21),
                new ContractStudent("Dan", 19, 20.1),
                new ContractStudent("Alisha", 21, 20.1),
                new Student("Mila",20)};
        findContractStudents(students);
    }

    private static void findContractStudents(Student[] students) {
        for (int i = 0; i <students.length ; i++) {
            Student student=students[i];
            if (student instanceof ContractStudent){
                ContractStudent cs=(ContractStudent) student;
                System.out.println("Contact students is "+cs.getName()+", contract price: "+cs.getPriceContract());
            }
        }
    }
}
