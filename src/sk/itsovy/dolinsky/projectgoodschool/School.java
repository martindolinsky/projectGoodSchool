package sk.itsovy.dolinsky.projectgoodschool;

import java.util.ArrayList;
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

	public int getAbsence() {
		return 0;
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
		return null;
	}

	@Override
	public List getListSortedByAbsenceDesc() {
		return null;
	}


}
