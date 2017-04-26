import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Петр on 27.04.2017.
 */
public class hashmap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("A","26.07.2000");
        map.put("B","27.06.2001");
        map.put("C","28.05.2000");
        map.put("D","20.04.2001");
        map.put("E","21.03.2000");
        map.put("F","22.02.2001");
        map.put("G","21.01.2000");
        map.put("H","26.07.2003");

        for (String val : map.values()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Calendar calendar = Calendar.getInstance();
            try {
                calendar.setTime(dateFormat.parse(val));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            calendar.add(Calendar.MONTH,1);
            System.out.println(dateFormat.format(calendar.getTime()));
        }

    }
}
