import repository.AppointmentRepository;
import util.AppointmentJSONConverterUtil;

public class UDSMainApp {
    private final AppointmentRepository appointmentRepository;

    UDSMainApp(){
        appointmentRepository = AppointmentRepository.getInstance();
    }
    public static void main(String[] args) {
        UDSMainApp usdMainApp = new UDSMainApp();

        var appointments = usdMainApp.appointmentRepository.getAppointments();

        String result = AppointmentJSONConverterUtil.convertAppointmentToJSON(appointments);

        System.out.println(result);
    }
}
