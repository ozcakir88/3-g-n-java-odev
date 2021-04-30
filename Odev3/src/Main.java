
public class Main {

	public static void main(String[] args) {
		User user1=new User();
		user1.setId(1);
		user1.setName("isa");
		user1.setEmail("isa@isa");
		user1.setPassword("12345");
		
		Student student=new Student();
		student.setId(1);
		student.setStudentNumber(108);
		student.setName("ögrenci isa");
		student.setEmail("ogrenciisa@isa");
		student.setPassword("12346");
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setInstructorNumber(1);
		instructor.setEducationArea("java");
		instructor.setName("Engin demirog");
		instructor.setEmail("engin@isa");
		instructor.setPassword("12346");
		
		UserManager userManager=new UserManager();
		UserManager userManager2=new StudentManager();
		UserManager userManager1=new InstructorManager();


		userManager.add(user1);
		userManager2.add(student);
		userManager1.add(instructor);
		
	}

}
