import static org.junit.Assert.*;

public class TableauxTest {

    @org.junit.Test
    public void trierCroissantSSS() {
        int[] tab = {5,4,2,3,1,6,7,9,8};
        int[] expectedTab = {1,2,3,4,5,6,7,8,9};
        Tableaux.trierCroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);

    }

    @org.junit.Test
    public void trierDecroissantSSS() {
        int[] tab = {5,4,2,3,1,6,7,9,8};
        int[] expectedTab = {9,8,7,6,5,4,3,2,1};
        Tableaux.trierDecroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @org.junit.Test
    public void testTrierDecroissantSSS() {
    }

    @org.junit.Test
    public void testTrierCroissantSSS() {
    }

    @org.junit.Test
    public void max() {
        int[] tab = {5,4,2,3,1,6,7,9,8};
        int expectedResult = 9;
        int result = Tableaux.max(tab);
        assertEquals(expectedResult, result);

        tab [4] = 10;
        expectedResult = 10;
        result = Tableaux.max(tab);
        assertEquals(expectedResult, result);

        tab[tab.length % 2] = 10;
        expectedResult = 10;
        result = Tableaux.max(tab);
        assertEquals(expectedResult, result);

    }

    @org.junit.Test
    public void testMax() {
    }

    @org.junit.Test
    public void min() {
        int[] tab = {5,4,2,3,1,6,7,9,8};
        int expectedResult = 1;
        int result = Tableaux.min(tab);
        assertEquals(expectedResult, result);

        tab [4] = -2;
        expectedResult = -2;
        result = Tableaux.min(tab);
        assertEquals(expectedResult, result);

        tab[tab.length % 2] = -2;
        expectedResult = -2;
        result = Tableaux.min(tab);
        assertEquals(expectedResult, result);
    }

    @org.junit.Test
    public void testMin() {
    }

    @org.junit.Test
    public void moyenne() {
        double[] tab = {5,4,2,3,1,6,7,9,8};
        double expectedResult = 5.0;
        double result = Tableaux.moyenne(tab);
        assertEquals(expectedResult,result,0);

        double[] tab2 ={};


    }

    @org.junit.Test
    public void testMoyenne() {
    }

    @org.junit.Test
    public void fouilleseq() {
        int[] tab = {5,4,2,3,1,6,7,9,8};
        int cherche = 5;
        int expectedResult = 0;
        int result = Tableaux.fouilleseq(tab,cherche);
        assertEquals(expectedResult, result);
    }

    @org.junit.Test
    public void testFouilleseq() {
    }
}