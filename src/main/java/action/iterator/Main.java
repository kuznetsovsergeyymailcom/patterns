package action.iterator;

import action.iterator.impl.JavaDeveloper;
import action.iterator.interfaces.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] skills = {"java", "bootstrap", "spring", "hibernate"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("ivan", skills);
        System.out.println(javaDeveloper.getName());
        System.out.println("Skills: ");
        Iterator iterator = javaDeveloper.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
