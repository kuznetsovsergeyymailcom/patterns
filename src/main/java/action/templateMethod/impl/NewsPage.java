package action.templateMethod.impl;

import action.templateMethod.template.WebsiteTemplate;

public class NewsPage extends WebsiteTemplate {
    @Override
    public void templateMethod() {
        System.out.println("News ..");
    }
}
