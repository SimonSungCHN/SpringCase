package AOP.concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConcertConfig.class)
//@ContextConfiguration("classpath:AOP/concert/aspectJ.xml")
public class AspectJTest {

  @Autowired
  private Performance per;
  
  @Test
  public void say(){
	  per.perform();
  }
  
  


  

}
