package cloud.luoyu.reborn.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by luoyu on 2020/05/30 11:00
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"cloud.luoyu.reborn.admin.mapper","cloud.luoyu.reborn.admin.dao","cloud.luoyu.reborn.mbg.dao","cloud.luoyu.reborn.mbg.mapper"})
public class MyBatisConfig {
}
