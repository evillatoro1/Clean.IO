package model;

import javafx.collections.ObservableList;

public final class Model {

    private static final Model instance = new Model();
    public static Model getInstance() {
        return instance;
    }

    /** database of project*/
    private Database database;

    /** remember the currently logged in profile*/
    private Profile loggedInProfile;

    private Model() {
        database = new Database();
        // default profiles to use to test
        addProfile(new Profile("u", "p", AccountType.USER, "user", "e"));
        addProfile(new Profile("w", "p", AccountType.WORKER, "worker", "e"));
        addProfile(new Profile("m", "p", AccountType.MANAGER, "manager", "e"));
        addProfile(new Profile("a", "p", AccountType.ADMIN, "admin", "e"));
    }

    /**
     * list of profiles in the database
     * @return list of profiles in the database
     */
    public ObservableList<Profile> getProfiles() {
        return database.getProfiles();
    }

    public ObservableList<WaterSourceReport> getWaterSourceReports() {
        return database.getWaterSourceReports();
    }

    public ObservableList<WaterPurityReport> getWaterPurityReports() {
        return database.getWaterPurityReports();
    }

    /**
     * add a profile to the database
     *
     * @param profile the profile to add to the database
     * @return true if profile added, false if not added
     */
    public boolean addProfile(Profile profile) {
        if ((database != null) && database.addProfile(profile)) {
            loggedInProfile = profile;
            return true;
        }
        return false;
    }

    public boolean removeProfile(String username) {
        return (database != null) && database.removeProfile(username);
    }

    public Profile searchForProfile(String username, String password) {
        if (database != null) {
            loggedInProfile = database.searchForProfile(username, password);
            return loggedInProfile;
        }
        return null;
    }

    /**
     * add a water source report to the database
     *
     * @param waterSourceReport the water source report to add to the database
     * @return true if water source report added, false if not added
     */
    public boolean addWaterSourceReport(WaterSourceReport waterSourceReport) {
        return (database != null) && database.addWaterSourceReport(waterSourceReport);
    }

    /**
     * add a water purity report to the database
     *
     * @param waterPurityReport the water purity report to add to the database
     * @return true if water purity report added, false if not added
     */
    public boolean addWaterPurityReport(WaterPurityReport waterPurityReport) {
        return (database != null) && database.addWaterPurityReport(waterPurityReport);
    }

    /**
     * sets the profile that is logged in
     *
     * @param profile profile that is logged in
     */
    public void setLoggedInProfile(Profile profile) {
        loggedInProfile = profile;
    }

    /**
     * gets the profile that is logged in
     *
     * @return the profile that is logged in
     */
    public Profile getLoggedInProfile() {
        return loggedInProfile;
    }

}
