import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Петр on 26.04.2017.
 */
public class Task_4 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String fileName="D:/ForAplana.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
            lines.forEach((k)->System.out.println(k));

            for (String i : lines) {
                Calendar calendar = Calendar.getInstance();
                //выделение подстроки с датой
                Date date = dateFormat.parse(i.substring(i.length()-10,i.length()));
                calendar.setTime(date);
                calendar.add(Calendar.YEAR,-1);
                System.out.println(dateFormat.format(calendar.getTime()));
            }
            
        }catch (NoSuchFileException e) {
            System.out.println("Файл \""+fileName+"\" не найден");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
