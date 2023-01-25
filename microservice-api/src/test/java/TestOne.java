import java.io.InputStream;

/**
 * @className: test
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/11/9 21:14
 **/
public class TestOne {

    public static void main(String[] args){
        TestOne testOne = new TestOne();
        try{
//            testOne.add();

//            TestOnePerson a = new TestOnePerson();
//            a.setAge(10);
//            TestOnePerson person = TestOne.person(a);
//            System.out.println(a == person);
//            System.out.println(a.getAge());
//            System.out.println(person.getAge());
//
//            System.out.println("-----");
//            int b = 10;
//            int number = number(b);
//            System.out.println(b);
//            System.out.println(number);
//            System.out.println(b==number);
//            number--;
//            System.out.println(b == number);
            TestOnePerson aa = new TestOnePerson();
            TestOnePerson bb = new TestOnePerson();
            System.out.println(aa);
            System.out.println(bb);
            System.out.println(aa == bb);
            aa.setAge(10);
            bb = aa;

            System.out.println(aa);
            System.out.println(bb);
            System.out.println(aa == bb);
            System.out.println(aa.getAge());
            bb.setAge(22);
            System.out.println(aa.getAge());


        }catch (Exception e){
            System.out.println("出现异常");
            e.printStackTrace();
        }
    }

    public void add () throws Exception{

        int a = 10/0;
        System.out.println("111");
//        try{
//            int a = 10/0;
//        }catch (Exception e ){
//            System.out.println("出现异常2");
//            e.printStackTrace();
//        }

    }

    public static TestOnePerson person(TestOnePerson testOnePerson){
//        System.out.println("前"+testOnePerson.getAge());
//        testOnePerson = new TestOnePerson();
        testOnePerson.setAge(20);
        return testOnePerson;
    }

    public static int number(int a){
        return ++a;
    }

}

class TestOnePerson {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
