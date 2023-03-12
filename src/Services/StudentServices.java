package Services;

import java.io.IOException;

public interface StudentServices {
	public void displayStudents() throws NumberFormatException, IOException;

	public void addStudent() throws NumberFormatException, IOException;

	public void updateStudent() throws NumberFormatException, IOException;

	public void deleteStudent() throws NumberFormatException, IOException;

}
