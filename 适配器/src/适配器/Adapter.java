package 适配器;

import java.util.*;

/**
 * 类模式
 */

//public class Adapter extends OldJuicer implements InewJuicer {
//    /**
//     * @param fruit1
//     * @param fruit2
//     * @return
//     */
//    public String newPort(String fruit1, String fruit2) {
//        // TODO implement here
//        String str = "混合果汁："+onePort(fruit1)+onePort(fruit2);
//        return str;
//    }
//
//}

/**
 * 对象模式
 */

public class Adapter implements InewJuicer {
    /**
     * @param fruit1
     * @param fruit2
     * @return
     */
    public String newPort(String fruit1, String fruit2) {
        // TODO implement here
        OldJuicer oldJuicer = new OldJuicer();
        String str = "混合果汁："+oldJuicer.onePort(fruit1)+oldJuicer.onePort(fruit2);
        return str;
    }

}