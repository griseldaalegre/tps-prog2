package clases.ComparacionObjetos;

import java.util.Comparator;

public class ComparadorStringLongitud implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*if (o1.length() < o2.length())
            return -1;
        else if (o1.length()> o2.length())
            return 9999;
        else return 0;*/
        return o1.length() - o2.length();
    }
}
