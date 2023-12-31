package lesson27;

import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideCollectionExample {

    @Test
    public void testCollections(){
        open("https://rozetka.com.ua/ua/");
        ElementsCollection sideMenu = $$(byXpath("//a[@class='menu-categories__link']"));
        int collectionSize = sideMenu.size();
        System.out.println(collectionSize);

        sideMenu.shouldHave(size(16));

        String text = sideMenu.get(1).getText();
        System.out.println(text);

        ElementsCollection filterCollection = sideMenu.filterBy(text("Product for gamers"));
        System.out.println(filterCollection.size());

    }
}
