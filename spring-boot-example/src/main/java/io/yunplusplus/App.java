package io.yunplusplus;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaoyt
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example", type = ConfigType.PROPERTIES,autoRefreshed = true)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
