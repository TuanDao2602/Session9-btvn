package BAI2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleClassifierTest {
    @Test
     void tamGiacDeu(){
        double a =2;
        double b =2;
        double c =2;
        String expected  = "no la tam giac deu";
        String resutl = TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(resutl,expected );
    }
    @Test
    void testTamGiacCan(){
        double a = 2;
        double b = 2;
        double c = 3;
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String expected  = "no la tam giac can";
        assertEquals(result,expected );
    }
    @Test
    void testTamGiacVuongCan(){
        double a = 3;
        double b = 3;
        double c = Math.sqrt(18) ;
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String expected  = "no la tam giac vuong can";
        assertEquals(expected ,result);

    }
    @Test
    void testTamgiacVuong(){
        double a =3;
        double b = 4;
        double c = 5 ;
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String expected  = "no la tam giac vuong";
        assertEquals(result,expected );

    }
    @Test
    void testTamGiacThuong(){
        double a =5;
        double b =4;
        double c = 6;
        String result = TriangleClassifier.triangleClassifier(a,b,c);
        String expected  = "no la tam giac thuong";
        assertEquals(result,expected );

    }

}
