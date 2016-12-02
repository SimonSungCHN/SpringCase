package IOC.scopedbeans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class ScopedBeanTests {

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=ComponentScannedConfig.class)
  public static class ComponentScannedScopedBeanTest {
    
    @Autowired
    private ApplicationContext context;
    
    @Test
    public void testProxyScope() {
      Notepad notepad1 = context.getBean(Notepad.class);
      Notepad notepad2 = context.getBean(Notepad.class);
      System.out.println(notepad1.hashCode());
      System.out.println(notepad2.hashCode());
    }
    
    @Test
    public void testSingletonScope() {
      UniqueThing thing1 = context.getBean(UniqueThing.class);
      UniqueThing thing2 = context.getBean(UniqueThing.class);
      System.out.println(thing1.hashCode());
      System.out.println(thing2.hashCode());
    }
    
  }
  
  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=ExplicitConfig.class)
  public static class ExplicitConfigScopedBeanTest {
    
    @Autowired
    private ApplicationContext context;
    
    @Test
    public void testProxyScope() {
      Notepad notepad1 = context.getBean(Notepad.class);
      Notepad notepad2 = context.getBean(Notepad.class);
      System.out.println(notepad1.hashCode());
      System.out.println(notepad2.hashCode());
    }
    
    @Test
    public void testSingletonScope() {
      UniqueThing thing1 = context.getBean(UniqueThing.class);
      UniqueThing thing2 = context.getBean(UniqueThing.class);
      System.out.println(thing1.hashCode());
      System.out.println(thing2.hashCode());
    }
    
  }

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration("classpath:IOC/scopedbeans/scoped-beans.xml")
  public static class XMLConfigScopedBeanTest {
    
    @Autowired
    private ApplicationContext context;
    
    @Test
    public void testProxyScope() {
      Notepad notepad1 = context.getBean(Notepad.class);
      Notepad notepad2 = context.getBean(Notepad.class);
      System.out.println(notepad1.hashCode());
      System.out.println(notepad2.hashCode());
    }
    
    @Test
    public void testSingletonScope() {
      UniqueThing thing1 = context.getBean(UniqueThing.class);
      UniqueThing thing2 = context.getBean(UniqueThing.class);
      System.out.println(thing1.hashCode());
      System.out.println(thing2.hashCode());
    }
    
  }


}
