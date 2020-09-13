package generics;

import java.util.List;

public class ClassMethodWithGenerics {

    public <T extends Number, G> G checkGenerics(T someVar) {
        System.out.println(someVar.getClass());

        G returnVar = (G) someVar.toString();

        return returnVar;
    }

    public void checkListGenerics(List<? super Double> list){
        System.out.println(list.get(0));
    }
}
