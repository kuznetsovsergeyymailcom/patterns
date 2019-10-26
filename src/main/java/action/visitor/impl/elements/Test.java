package action.visitor.impl.elements;

import action.visitor.interfaces.Developer;
import action.visitor.interfaces.ProjectElement;

public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
