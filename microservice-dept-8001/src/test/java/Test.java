import com.study.common.utils.MD5Util;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Random;

/**
 * @className: Test
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/15 13:35
 **/
public class Test {

    @org.junit.Test
    public void MD5Test(){
        String keyword="123456";
        String md5= DigestUtils.md5Hex(keyword);
        System.out.println("md5加密后："+"\n"+md5);
        String md5salt= MD5Util.md5PlusSalt(keyword);
        System.out.println("加盐后："+"\n"+md5salt);
        String word= MD5Util.md5MinusSalt(md5salt);
        System.out.println("解密后："+"\n"+word);
    }

    @org.junit.Test
    public void Ra(){
        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);

    }


}
