package action.chapter02.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(JavaSingleConfig.class)
@ImportResource("action/chapter02/xml/blankDisc-xml-config.xml")
public class XmlToJavaConfigMixConfig {

}
