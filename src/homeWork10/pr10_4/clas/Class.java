package homeWork10.pr10_4.clas;

import homeWork10.pr10_4.interf.Interface;

public class Class {

    protected class A implements Interface {
        @Override
        public void go() {
            Interface.super.go();
        }
    }

}
