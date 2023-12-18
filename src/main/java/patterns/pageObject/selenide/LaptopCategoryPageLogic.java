package patterns.pageObject.selenide;

import com.codeborne.selenide.CollectionCondition;

import java.time.Duration;

public class LaptopCategoryPageLogic extends LaptopCategoryPageLocators implements IHeader, ICartPopup{
    public LaptopCategoryPageLogic checkQuantityOfGoodsTittles(int tittleAmount) {
        tittleOfAllProducts
                .shouldBe(CollectionCondition.size(tittleAmount), Duration.ofSeconds(20));
        return this;
    }
    public String productTitleFromList(int productNumber){
        return tittleOfAllProducts
                .get(productNumber).getText().trim();
    }
    public LaptopCategoryPageLogic addProductToBasket(int productAmount){
        buyLaptopsProducts.get(productAmount).click();
        return this;

    }
    public LaptopCategoryPageLogic checkingCartCounter(String expectedCartCount){
        checkingCartCounterI(expectedCartCount);
        return this;
    }
    public  LaptopCategoryPageLogic openCartPopup(){
        openCartPopupI();
        return this;
    }
    public String checkingAddedProduct(int numberOfProduct){
        String titleFromList = productTitleFromList(numberOfProduct);
        checkingAddedProductI(numberOfProduct, titleFromList);
        return titleFromList;
    }

}
