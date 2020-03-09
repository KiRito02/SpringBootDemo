package CM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//该注解即生命SpringBoot的引导类
@SpringBootApplication
public class BootApplication {
    //main是java程序的入口
    public static void main(String[] args) {
        //run方法即运行SpringBoot的引导类run的参数就是引导类的字节码对象
        SpringApplication.run(BootApplication.class);
    }
}
