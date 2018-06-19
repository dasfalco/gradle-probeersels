import vdab.Breuk;
import org.junit.Assert;
import org.junit.Test;

public class Breuktest {

    @Test
    public void BreukenOptellenCheck(){
        Breuk a = new Breuk(2,3);
        Breuk b = new Breuk(1,2);
        Breuk c = a.plus(b);
        Assert.assertEquals(7,c.getTeller());
        Assert.assertEquals(6,c.getNoemer());

    }
    @Test
    public void BreukenOptellenCheck2(){
        Breuk a = new Breuk(1,4);
        Breuk b = new Breuk(0,2);
        Breuk c = a.plus(b);
        Assert.assertEquals(2,c.getTeller());
        Assert.assertEquals(8,c.getNoemer());

    }
}
