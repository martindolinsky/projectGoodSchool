package sk.itsovy.dolinsky.projectgoodschool;

import java.util.ArrayList;
import java.util.Collections;
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
					"Name: " + student.getFullName()
							+ " MAT: " + student.getG_Mat()
							+ " ENG: " + student.getG_Eng()
							+ " INF: " + student.getG_Inf()
							+ " ABSENCE: " + student.getAbsence()
			);

		}
	}

	@Override
	public Student getTheBestStudent() {
		double[] array = new double[list.size()];
		Student theBestStudent = null;

		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i).getAverageGrade();
		}

		arraySelectionSort(array);

		for (int i = 0; i < list.size(); i++) {
			if (array[0] == list.get(i).getAverageGrade()) {
				theBestStudent = list.get(i);
			}
		}
		return theBestStudent;
	}

	@Override
	public int getAverageAbsence() {
		double countOfAbsence = 0;
		for (int i = 0; i < list.size(); i++) {
			countOfAbsence += list.get(i).getAbsence();
		}
		return (int) countOfAbsence / list.size();

	}

	@Override
	public double getAverageGrade() {
		double[] array = new double[list.size()];
		double count = 0;

		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i).getAverageGrade();
		}

		for (int i = 0; i < list.size(); i++) {
			count += array[i];
		}

		return count / (double) list.size();
	}

	@Override
	public double getAverageGradeFromMath() {
		double[] array = new double[list.size()];
		double count = 0;

		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i).getG_Mat();
		}

		for (int i = 0; i < list.size(); i++) {
			count += array[i];
		}

		return count / (double) list.size();
	}

	@Override
	public Student getTheWorstStudent() {
		double[] array = new double[list.size()];
		Student theWorstStudent = null;

		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i).getAverageGrade();
		}

		arraySelectionSort(array);

		for (int i = 0; i < list.size(); i++) {
			if (array[list.size() - 1] == list.get(i).getAverageGrade()) {
				theWorstStudent = list.get(i);
			}
		}
		return theWorstStudent;
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
		list.sort(Comparator.comparing(Student::getFirstName));
		list.sort(Comparator.comparing(Student::getLastName));
		return list;
	}

	@Override
	public List getListSortedByAbsenceDesc() {
		list.sort(Comparator.comparingInt(Student::getAbsence));
		Collections.reverse(list);
		return list;
	}

	public double[] arraySelectionSort(double[] array) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (array[i] > array[j]) {
					double temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}


}
