package action.visitor.interfaces;

import action.visitor.impl.elements.Database;
import action.visitor.impl.elements.ProgramClass;
import action.visitor.impl.elements.Test;

public interface Developer {

    void create(ProgramClass programClass);
    void create(Database database);
    void create(Test test);
}
