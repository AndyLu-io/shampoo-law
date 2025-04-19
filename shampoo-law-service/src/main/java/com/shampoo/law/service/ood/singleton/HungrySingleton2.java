package com.shampoo.law.service.ood.singleton;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -12:04
 */
public class HungrySingleton2 {

        private static  HungrySingleton2 instance;

        static {
            instance = new HungrySingleton2();
        }

        private HungrySingleton2() {
        }

        public  static HungrySingleton2 getInstance() {
            return instance;
        }
}
