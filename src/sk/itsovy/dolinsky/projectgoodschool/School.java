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
		double countOfAbsence = 0;
		for (int i = 0; i < list.size(); i++) {
			countOfAbsence += list.get(i).getAbsence();
		}
		int averageAbsence = (int) countOfAbsence / list.size();
		return averageAbsence;
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
		int n = list.size();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = list.get(i).getAbsence();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[0];
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
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getAbsence() < list.get(j).getAbsence()) {
					list.set(i, list.get(j));
				}
			}
		}

		return list;
	}


}
