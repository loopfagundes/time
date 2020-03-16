package batePonto;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class CalcHours {

    public CalcHours() {

    }

    public static String diffHours(String initialHour, String finalHour){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date horaIni = sdf.parse(initialHour);
            Date horaFim = sdf.parse(finalHour);

            long horaI = horaIni.getTime();
            long horaF = horaFim.getTime();
            long diferencaHoras = horaF - horaI;

            return String.format( "%02d:%02d", diferencaHoras / 3600000, ( diferencaHoras / 60000 ) % 60 );
        } catch(Exception ex) {
            ex.getStackTrace();
        }

        return "(Falha)";
    }

    public static String calcHoras(String hourOne, String hourTwo) {
        LocalTime primeiro = LocalTime.parse(hourOne);
        LocalTime segundo  = LocalTime.parse(hourTwo);

        LocalTime total = primeiro.plusHours(segundo.getHour())
                .plusMinutes(segundo.getMinute());

        return total.toString();
    }

    public static String avisoHour(String durante1, String fimInt) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {

        } catch(Exception ex) {
            ex.getStackTrace();
        }

        return "(Falha)";
    }

}
