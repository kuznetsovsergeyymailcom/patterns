package structure.proxy.impl;

import structure.proxy.interfaces.Program;

public class ProxyProgram implements Program {
    private String url;
    private Program program;

    public ProxyProgram(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(program == null){
            program = new RealProgram(url);
        }
        program.run();
    }
}
