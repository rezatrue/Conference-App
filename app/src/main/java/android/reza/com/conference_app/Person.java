package android.reza.com.conference_app;

/**
 * Created by jAVA USER on 10/3/2017.
 */

public class Person {
    private String name;
    private String designation;
    private String university;
    private String country;
    private String cobtactInfo;

    public Person() {
    }

    public Person(String name, String designation, String university, String country, String cobtactInfo) {
        this.name = name;
        this.designation = designation;
        this.university = university;
        this.country = country;
        this.cobtactInfo = cobtactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
