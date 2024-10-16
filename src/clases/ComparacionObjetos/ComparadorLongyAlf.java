package clases.ComparacionObjetos;

import java.util.Comparator;

public class ComparadorLongyAlf implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        /*if (o1.length() < o2.length())
            return -1;
        else if (o1.length() > o2.length())
            return 1;
        else { //son iguales, uso el segundo criterio de orden
            return o1.compareTo(o2);
        }*/
        int res = o1.length() - o2.length();
        if (res == 0 ) return o1.compareTo(o2);
        else return res;
    }
}
