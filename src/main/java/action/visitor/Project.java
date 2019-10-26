package action.visitor;

import action.visitor.impl.elements.Database;
import action.visitor.impl.elements.ProgramClass;
import action.visitor.impl.elements.Test;
import action.visitor.interfaces.Developer;
import action.visitor.interfaces.ProjectElement;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project(){
        projectElements = new ProjectElement[]{
                new ProgramClass(), new Database(), new Test()
        };
    }
    @Override
    public void beWritten(Developer developer) {
        for(ProjectElement projectElement : projectElements){
            projectElement.beWritten(developer);
        }
    }
}
