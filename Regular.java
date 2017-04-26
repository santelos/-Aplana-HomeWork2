/**
 * Created by Петр on 26.04.2017.
 */
public class Regular {
    public static void main(String[] args) {
        String str = new String("Таиланд, тайланд, Тайланд , Испания , Англия , испании, Тайланд2233, 333тайланд");
//        Pattern pattern = Pattern.compile("Тайланд");
//        Matcher matcher = pattern.matcher(str);
//        matcher.replaceAll("Италия");
        System.out.println(str=str.replaceAll(".а.ланд","Италия"));
        System.out.println(str=str.replaceAll(".спани.","Кипр"));
    }
}
