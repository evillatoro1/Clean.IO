package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * water purity report
 */
public class WaterPurityReport {
    private static int reportNumber = 1;
    private String date;
    private String time;
    private String nameOfReporter;
    private Double latitude;
    private Double longitude;
    private Double virusPPM;
    private Double contaminantPPM;
    private OverallCondition overallCondition;
    private final IntegerProperty thisInstanceReportNumber =
            new SimpleIntegerProperty();

    private int month;
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    /**
     * makes a water purity report
     * @param date date being passed in
     * @param time time being passed in
     * @param nameOfReporter name of report being passed in
     * @param latitude latitude passed in
     * @param longitude longitude passed in
     * @param overallCondition overall condition passed in
     * @param virusPPM virusPPM being passed in
     * @param contaminantPPM contaminantPPm being passed in
     */

    public WaterPurityReport(String date, String time, String nameOfReporter,
                             Double latitude, Double longitude,
                             OverallCondition overallCondition,
                             Double virusPPM, Double contaminantPPM) {
        this.date = date;
        this.time = time;
        this.nameOfReporter = nameOfReporter;
        this.latitude = latitude;
        this.longitude = longitude;
        this.overallCondition = overallCondition;
        this.virusPPM = virusPPM;
        this.contaminantPPM = contaminantPPM;
        this.thisInstanceReportNumber.setValue(reportNumber);
        //reportNumber++;

    }

    public Double getVirusPPM() {
        return virusPPM;
    }

    public void setVirusPPM(Double virusPPM) {
        this.virusPPM = virusPPM;
    }

    public Double getContaminantPPM() {
        return contaminantPPM;
    }

    public void setContaminantPPM(Double contaminantPPM) {
        this.contaminantPPM = contaminantPPM;
    }

    public OverallCondition getOverallCondition() {
        return overallCondition;
    }

    public void setOverallCondition(OverallCondition overallCondition) {
        this.overallCondition = overallCondition;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNameOfReporter() {
        return nameOfReporter;
    }

    public void setNameOfReporter(String nameOfReporter) {
        this.nameOfReporter = nameOfReporter;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public static int getReportNumber() {
        return reportNumber;
    }

    public static void setReportNumber(int reportNumber) {
        WaterPurityReport.reportNumber = reportNumber;
    }

    public int getThisInstanceReportNumber() {
        return thisInstanceReportNumber.get();
    }

    public void setThisInstanceReportNumber(int thisInstanceReportNumber) {
        this.thisInstanceReportNumber.setValue(thisInstanceReportNumber);
    }

    public IntegerProperty getThisReportNumberProperty() {
        return thisInstanceReportNumber;
    }

}
