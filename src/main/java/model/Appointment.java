package model;

import org.json.JSONObject;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private String appointmentId;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private Patient patient;

    public Appointment(String appointmentId, LocalDate appointmentDate, LocalTime appointmentTime, Patient patient) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.patient = patient;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId='" + appointmentId + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", appointmentTime=" + appointmentTime +
                ", patient=" + patient +
                '}';
    }

    public JSONObject toJSON(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appointmentId", appointmentId);
        jsonObject.put("appointmentDate", appointmentDate);
        jsonObject.put("appointmentTime", appointmentTime);
        jsonObject.put("patient", patient.toJSON());

        return jsonObject;
    }
}
