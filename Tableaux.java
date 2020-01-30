/**
 * @author France Beaudoin
 */
public class Tableaux {
    private static void permute(int[] tab, int i1, int i2){
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }


    private static void permute(String[] tab, int i1, int i2){
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }
    public static void trierDecroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] > tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }
    public static void trierDecroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) > Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }


    public static void trierCroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }
    public static int max (int[] tab){
        int maximum = 0;
        for (int i=0; i<tab.length; i++){
            if (maximum<tab[i])
                maximum=tab[i];

        }
        return maximum;
    }
    public static int max (String[] tab){
        int maximum = 0;
        for (int i=0; i<tab.length; i++){
            if (maximum<Integer.parseInt(tab[i]))
                maximum=Integer.parseInt(tab[i]);

        }
        return maximum;
    }
    public static int min (int[] tab) {
        int minimum = 9;
        for (int i = 0; i < tab.length; i++) {
            if (minimum > tab[i])
                minimum = tab[i];

        }
        return minimum;
    }
    public static int min (String[] tab) {
        int minimum = 9;
        for (int i = 0; i < tab.length; i++) {
            if (minimum > Integer.parseInt(tab[i]))
                minimum = Integer.parseInt(tab[i]);

        }
        return minimum;
    }
    public static int moyenne (int[] tab) {
        int moyenne=0;
        for (int i = 0; i < tab.length; i++) {
            moyenne+=tab[i];
        }
        moyenne/=tab.length;
        return moyenne;
    }
    public static int moyenne (String[] tab) {
        int moyenne=0;
        for (int i = 0; i < tab.length; i++) {
            moyenne+=Integer.parseInt(tab[i]);
        }
        moyenne/=tab.length;
        return moyenne;
    }
    public static int fouilleseq (int[] tab,int cherche){
        boolean trouve = false;
        int i = 0;
        while(i<tab.length && !trouve){
            if (tab[i] == cherche)
                trouve = true;
            else i++;
        }
        if (trouve)
            return i;
        else
            return -1;
    }
    public static int fouilleseq (String[] tab,String cherche2){
        boolean trouve = false;
        int i = 0;
        while(i<tab.length && !trouve){
            if (tab[i].equals(cherche2))
                trouve = true;
            else i++;
        }
        if (trouve)
            return i;
        else
            return -1;
    }
}
