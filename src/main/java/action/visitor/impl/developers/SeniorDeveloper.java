package action.visitor.impl.developers;

import action.visitor.impl.elements.Database;
import action.visitor.impl.elements.ProgramClass;
import action.visitor.impl.elements.Test;
import action.visitor.interfaces.Developer;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProgramClass programClass) {
        System.out.println("Rewrite code of program");
    }

    @Override
    public void create(Database database) {
        System.out.println("Repair database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Writes complex tests");
    }
}
