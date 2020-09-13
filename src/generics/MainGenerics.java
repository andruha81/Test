package generics;

import java.util.ArrayList;
import java.util.List;

public class MainGenerics {

    public static void main(String[] args) {

        ClassMethodWithGenerics test = new ClassMethodWithGenerics();

        Short someVar = 44;
        Long anotherVar = 15545454L;

        String str = test.checkGenerics(someVar);

        System.out.println(str.getClass());

        List<Double> list = new ArrayList<>();

        list.add(55.6);

        test.checkListGenerics(list);

    }
}
