import vdab.Prime;
import org.junit.Assert;
import org.junit.Test;

public class PrimeTest {

    @Test
        public void testBlablabla() {
        boolean out = Prime.isPrime(7);
        Assert.assertTrue(out);
    }
    @Test
        public void SixIsNotaPrime() {
        boolean out = Prime.isPrime(6);
        Assert.assertFalse(out);
    }
    @Test
        public void OneIsNotaPrime() {
        boolean out = Prime.isPrime(1);
        Assert.assertFalse(out);
            }
        }

