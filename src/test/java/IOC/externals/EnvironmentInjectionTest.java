package IOC.externals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class EnvironmentInjectionTest {

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=EnvironmentConfig.class)
  public static class InjectFromProperties {
  
    @Autowired
    private BlankDisc blankDisc;
    
    @Test
    public void assertBlankDiscProperties() {
      System.out.println(blankDisc.getArtist());
      System.out.println(blankDisc.getTitle());
    }
    
  }
  
  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=EnvironmentConfigWithDefaults.class)
  public static class InjectFromPropertiesWithDefaultValues {
  
    @Autowired
    private BlankDisc blankDisc;
    
    @Test
    public void assertBlankDiscProperties() {
    	System.out.println(blankDisc.getArtist());
    	System.out.println(blankDisc.getTitle());
    }
    
  }

  public static class InjectFromPropertiesWithRequiredProperties {
  
    @Test(expected=BeanCreationException.class)
    public void assertBlankDiscProperties() {
      new AnnotationConfigApplicationContext(EnvironmentConfigWithRequiredProperties.class);
    }
    
  }

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration("classpath:IOC/externals/placeholder-config.xml")
  public static class InjectFromProperties_XMLConfig {
  
    @Autowired
    private BlankDisc blankDisc;
    
    @Test
    public void assertBlankDiscProperties() {
    	System.out.println(blankDisc.getArtist());
    	System.out.println(blankDisc.getTitle());
    }
    
  }

}