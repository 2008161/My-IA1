package org.example;

public class CriterionScore {

   int performance;
    int  discipline;
        int    engagement;
  int  attendance;
              int      efficiency;

    public CriterionScore(int performance, int discipline, int engagement, int attendance) {
        this.performance = performance;
        this.discipline = discipline;
        this.engagement = engagement;
        this.attendance = attendance;
        this.efficiency = performance*discipline; //This needs fixing
    }

    public int getPerformance() {
        return performance;
    }

    public int getDiscipline() {
        return discipline;
    }

    public int getEngagement() {
        return engagement;
    }

    public int getAttendance() {
        return attendance;
    }

}
