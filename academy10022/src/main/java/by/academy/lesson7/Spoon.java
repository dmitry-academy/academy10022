package by.academy.lesson7;
public class Spoon {
    @Override
    protected void finalize() {
        System.out.println("Ложка исчезает навсегда");
    }
}