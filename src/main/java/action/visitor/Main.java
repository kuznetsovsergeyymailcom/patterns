package action.visitor;

import action.visitor.impl.developers.JuniorDeveloper;
import action.visitor.impl.developers.SeniorDeveloper;
import action.visitor.impl.elements.Database;
import action.visitor.impl.elements.ProgramClass;
import action.visitor.impl.elements.Test;
import action.visitor.interfaces.Developer;

public class Main {
    public static void main(String[] args) {

        Project project = new Project();

        Developer developer = new JuniorDeveloper();
        Developer developer1 = new SeniorDeveloper();

        project.beWritten(developer);
        project.beWritten(developer1);

    }
}
