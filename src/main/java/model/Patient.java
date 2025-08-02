package model;

import org.json.JSONObject;
import org.json.JSONWriter;

import java.time.LocalDate;

public class Patient {
    private String firstName, lastName, phnNumber;
    private LocalDate dateOfBirth;

    public Patient(String firstName, String lastName, String phnNumber, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phnNumber = phnNumber;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phnNumber='" + phnNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public JSONObject toJSON(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("firstName", firstName);
        jsonObject.put("lastName", lastName);
        jsonObject.put("phnNumber", phnNumber);
        jsonObject.put("dateOfBirth", dateOfBirth);

        return jsonObject;
    }
}
