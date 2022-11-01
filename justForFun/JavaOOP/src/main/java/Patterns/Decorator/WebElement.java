package Patterns.Decorator;

/**
 * Created by Nikasan
 */
public class WebElement implements Element {

   private Element e;

   public WebElement(Element e){
       this.e =e;
   }

   public Element getWrapped(){
       return e;
   }

    @Override
    public void click() {
        getWrapped().click();
    }

    @Override
    public boolean isDisplayed() {
        return getWrapped().isDisplayed();
    }
}
