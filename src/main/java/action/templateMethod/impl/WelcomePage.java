package action.templateMethod.impl;

import action.templateMethod.template.WebsiteTemplate;

public class WelcomePage extends WebsiteTemplate {
    @Override
    public void templateMethod() {
        System.out.println("welcome..");
    }
}
