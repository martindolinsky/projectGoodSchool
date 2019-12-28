package sk.itsovy.dolinsky.projectgoodschool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Martin Dolinsky
 */
public class School implements SchoolStat {

	private List<Student> list;
	private int count;

	public School() {
		list = new ArrayList<>();
	}

	public void addStudent(Student student) {
		list.add(student);
		count++;
	}

	public int getCount() {
		return count;
	}

	public void printList() {
		for (Student student:list) {
			System.out.println(
					student.getFullName()
					+ " "
					+ student.getG_Mat()
					+ " "
					+ student.getG_Eng()
					+ " " + student.getG_Inf()
					+ " " + student.getAbsence()
			);

		}
	}

	@Override
	public Student getTheBestStudent() {
		return null;
	}

	@Override
	public int getAverageAbsence() {
		return 0;
	}

	@Override
	public double getAverageGrade() {
		return 0;
	}

	@Override
	public double getAverageGradeFromMath() {
		return 0;
	}

	@Override
	public Student getTheWorstStudent() {
		return null;
	}

	@Override
	public int getTheLowestAbsence() {
		return 0;
	}

	@Override
	public List getListSortedByLastNameAsc() {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j).getLastName().compareToIgnoreCase(list.get(i).getLastName()) <= 0
						&& list.get(j).getFirstName().compareToIgnoreCase(list.get(i).getFirstName()) <= 0) {
					list.set(i,list.get(j));
				}
			}
		}
		return list;
	}

	@Override
	public List getListSortedByAbsenceDesc() {
		return null;
	}


}
