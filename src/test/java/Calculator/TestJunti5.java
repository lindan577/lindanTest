package Calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * @author lindan
 * @date 2020-11-06 18:05
 */
public class TestJunti5 {


    @Test
    public  void  addErrorTest()
    {
        int result1 =Calculator.add(1,2);
        System.out.println("addErrorTest加法结果:"+result1);
        Assertions.assertEquals(result1,6,"断言加法错误");
    }


    @Test
    public void  addSuccessTest()
    {
        int result2=Calculator.add(1,1);
        System.out.println("addSuccessTest加法结果:"+result2);
        Assertions.assertEquals(result2,2,"加法正确");
    }

    @Test
    public  void addErrorAndSuccessTest()
    {
        int result1 =Calculator.add(2,3);
        int result2 =Calculator.add(5,6);
        //java 8 lambdas  当一个断言失败，剩下的断言依然会执行。
        Assertions.assertAll(("计算结果："),
                ()-> Assertions.assertEquals(result1,5,"加法正确"),
        ()-> Assertions.assertEquals(result2,6,"加法错误")
        );
    }

    @Test
    public  void countTest() throws InterruptedException
    {
        int result =Calculator.count(1);
         result =Calculator.count(1);
         result =Calculator.count(2);
         System.out.println(result);
        Assertions.assertEquals(result,2,"")   ;
    }
}


