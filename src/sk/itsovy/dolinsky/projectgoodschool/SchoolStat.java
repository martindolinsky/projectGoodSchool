package sk.itsovy.dolinsky.projectgoodschool;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
public interface SchoolStat {

	Student getTheBestStudent();
	int getAverageAbsence();
	double getAverageGrade();
	double getAverageGradeFromMath();
	Student getTheWorstStudent();
	int getTheLowestAbsence();
	List getListSortedByLastNameAsc();
	List getListSortedByAbsenceDesc();
}
