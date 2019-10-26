package action.visitor.impl.developers;

import action.visitor.impl.elements.Database;
import action.visitor.impl.elements.ProgramClass;
import action.visitor.impl.elements.Test;
import action.visitor.interfaces.Developer;

public class JuniorDeveloper implements Developer {

    @Override
    public void create(ProgramClass programClass) {
        System.out.println("Writes bad code..");
    }

    @Override
    public void create(Database database) {
        System.out.println("drops database ..");
    }

    @Override
    public void create(Test test) {
        System.out.println("writes not complex tests");
    }
}
