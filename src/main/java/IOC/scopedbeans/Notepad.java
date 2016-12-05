package IOC.scopedbeans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)    //原型：：每次注入或者通过Spring应用上下文获取的 时候，都会创建一个新的bean实例
public class Notepad {
  // the details of this class are inconsequential to this example
}
