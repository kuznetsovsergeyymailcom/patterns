package action.templateMethod.template;

public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("Header");
        templateMethod();
        System.out.println("Footer");
    }

    protected abstract void templateMethod();
}
