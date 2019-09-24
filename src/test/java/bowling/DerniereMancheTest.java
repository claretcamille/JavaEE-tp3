package bowling;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * test de la classe DerniereManche donc de la 10 ou le joueur peut disposer de 3 boule
 * @author camilleclaret
 */
public class DerniereMancheTest {
    private DerniereManche m;
    
    @Before
    public void setUp() {
        m = new DerniereManche();
    }
    
   @Test
   public void bonusStricke(){
       m.quilleAbbatue(10);
       assertEquals(10,m.stickeBonus());
       m.quilleAbbatue(10);
        assertEquals(20,m.stickeBonus());
       m.quilleAbbatue(10);
        assertEquals(20,m.stickeBonus());
   }
   
   @Test
   public void bonusSpare(){
       m.quilleAbbatue(8);
       m.quilleAbbatue(2);
       assertEquals(10, m.spareBonus());
       m.quilleAbbatue(5);
       assertEquals(15, m.spareBonus());
   }
}