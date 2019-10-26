package action.templateMethod;

import action.templateMethod.impl.NewsPage;
import action.templateMethod.impl.WelcomePage;
import action.templateMethod.template.WebsiteTemplate;

public class Main {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        newsPage.showPage();

    }
}
