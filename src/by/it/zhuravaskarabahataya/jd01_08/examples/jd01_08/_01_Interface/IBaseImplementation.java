package by.it.zhuravaskarabahataya.jd01_08.examples.jd01_08._01_Interface;

public class IBaseImplementation implements IBaseAction {
    public boolean openAccount() {
        return false;
    }
    public boolean closeAccount() {
        return false;
    }
    public void blocking() {
        System.out.print("blocking");
    }
    public void unBlocking() {
        System.out.print("unBlocking");
    }
}