package ac.cn.saya.config;

import com.alibaba.fescar.spring.annotation.GlobalTransactionScanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: heshouyou
 * @Description  fescar global configuration
 * @Date Created in 2019/1/24 10:28
 */
@Configuration
public class FescarConfig {

    /**
     * init global transaction scanner
     *
     * @Return: GlobalTransactionScanner
     */
    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        return new GlobalTransactionScanner("dubbo-nacos-consumer", "my_test_tx_group");
    }
}
