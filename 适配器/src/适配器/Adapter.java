package ������;

import java.util.*;

/**
 * ��ģʽ
 */

//public class Adapter extends OldJuicer implements InewJuicer {
//    /**
//     * @param fruit1
//     * @param fruit2
//     * @return
//     */
//    public String newPort(String fruit1, String fruit2) {
//        // TODO implement here
//        String str = "��Ϲ�֭��"+onePort(fruit1)+onePort(fruit2);
//        return str;
//    }
//
//}

/**
 * ����ģʽ
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
        String str = "��Ϲ�֭��"+oldJuicer.onePort(fruit1)+oldJuicer.onePort(fruit2);
        return str;
    }

}