package cn.heima;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class RedisTest {
    @Autowired
    private RedisTemplate<String, String> rp;

    @Test
    public void redistest() {
        //1:从redis中查询数据
        //String userListJson = rp.boundValueOps("user.findAll").get();
        //2:判断redis中是否存在数据
       /* if (null == userListJson) {
            //3:如果不存在 ,去数据库中查询

        }*/
        rp.opsForValue().set("name","张三");
        System.out.println("name:" +rp.boundValueOps("name").get());
        //4:在控制台打印
    }
}
