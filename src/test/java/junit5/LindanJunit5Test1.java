package junit5;

import org.junit.jupiter.api.*;

import java.util.HashMap;

/**
 * @author lindan
 * @date 2020-11-03 15:47
 */
public class LindanJunit5Test1 {

    protected HashMap<String,Object> testMap=new HashMap<String, Object>();

    @Test
    void login(){
        testMap.put("login","登录成功");
        System.out.println("登录成功");
       // System.out.println(testMap.toString());
    }
    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class payTest{
        @BeforeAll
        void beforeAll(){
            System.out.println("beforeAll");
        }
        @Test
        void payTest(){
            if(null!=testMap.get("buy")){
                System.out.println("买个苹果");
                System.out.println(testMap.get("buy"));
                System.out.println("支付成功");
            }else{
                System.out.println("请先下单购买产品");
            }
        }
        @AfterAll
        void afterAll(){
            System.out.println("AfterAll");
        }
    }


          @Test
        void buyTest(){
            if("登录成功".equals(testMap.get("login"))){
                System.out.println("登录成功，可以购买产品了");
                testMap.put("buy","购买产品成功，请支付");
            }else{
                System.out.println("请先进行登录");
            }


        }
}
