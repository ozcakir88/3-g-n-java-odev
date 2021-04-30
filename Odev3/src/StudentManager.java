
public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(	" ogrenci eklendi eklendi " + user.getName());
	}
}
