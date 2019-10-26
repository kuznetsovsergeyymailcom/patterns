package structure.proxy.impl;

import structure.proxy.interfaces.Program;

public class RealProgram implements Program {
    private String url;

    public RealProgram(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading program from url: " + url);
    }

    @Override
    public void run() {
        System.out.println("Running program from url: " + url);
    }
}
