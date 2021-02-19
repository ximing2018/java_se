package com.qian.changmey.clazz;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.clazz
 * @ClassName: BClassMain
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/8 6:14
 * @Version: 1.0
 */
public class BClassMain {

    public static void main(String[] args) {
        BClassMain.bb(new BClass());
    }

    public static void bb(BAbtractClass ba){
        BClass bClass = (BClass)ba;
        bClass.aa();
    }
}
