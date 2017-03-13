package org.pos.testmybatis;

import javax.annotation.Resource;  

import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.pos.entity.Tbuser;
  
  
@RunWith(SpringJUnit4ClassRunner.class)      
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestMyBatis {  
   /* private static Logger logger = Logger.getLogger(TestMyBatis.class);  
 
    @Resource  
    private IUserService userService = null;  
  
 
    @Test  
    public void test1() {  
        Tbuser user = userService.getUserById();  
        // System.out.println(user.getUserName());  
        
        logger.info(JSON.toJSONString(user));  
    }  */
}  