package util;

import model.Appointment;
import org.json.JSONArray;

import java.util.Arrays;
import java.util.Comparator;

public class AppointmentJSONConverterUtil {
    public static String convertAppointmentToJSON(Appointment[] appointments) {
        JSONArray jsonArray = new JSONArray();
        Arrays.stream(appointments)
                .filter(appointment -> appointment.getAppointmentDate().getYear() == 2025 && appointment.getAppointmentDate().getMonthValue() <= 3)
                .sorted(Comparator.comparing(Appointment::getAppointmentDate).reversed())
                .forEach(appointment -> jsonArray.put(appointment.toJSON()));

        return jsonArray.toString(2);
    }
}
