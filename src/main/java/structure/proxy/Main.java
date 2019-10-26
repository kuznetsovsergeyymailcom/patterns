package structure.proxy;

import structure.proxy.impl.ProxyProgram;
import structure.proxy.interfaces.Program;

public class Main {

    public static void main(String[] args) {
        Program program = new ProxyProgram("http://www.github.com/kuznesovsergeyymail/realprogram");
        program.run();
    }
}
