import repository.AppointmentRepository;
import util.AppointmentJSONConverterUtil;

public class USDMainApp {
    private final AppointmentRepository appointmentRepository;

    USDMainApp(){
        appointmentRepository = AppointmentRepository.getInstance();
    }
    public static void main(String[] args) {
        USDMainApp usdMainApp = new USDMainApp();

        var appointments = usdMainApp.appointmentRepository.getAppointments();

        String result = AppointmentJSONConverterUtil.convertAppointmentToJSON(appointments);

        System.out.println(result);
    }
}
