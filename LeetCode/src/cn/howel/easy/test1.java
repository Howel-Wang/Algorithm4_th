package cn.howel.easy;

/**
 * @author howel
 * @version 1.0.0
 * @Description
 */
public class test1 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long endTime = startTime + 1000;
        long count = 0;

        while (true) {
            Math.sqrt(count);
            if (endTime < System.currentTimeMillis()) {
                break;
            }
            ++count;
        }
        System.out.println("一秒内进行了" + count + " 次循环");
    }

}
