package cloud.luoyu.reborn.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于MBG生成
 * Created by luoyu on 2020/05/30 10:04
 */
public class Generator {
    public static void main(String[] args) throws Exception{
        //执行过程中的警告信息
        List<String> warnings = new ArrayList<String>();
        //设置是否覆盖原代码
        boolean overwrite = true;
        //读取配置文件
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration configuration = cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        //创建MBG
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, callback, warnings);
        //运行生成代码
        myBatisGenerator.generate(null);
        //打印警告
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
