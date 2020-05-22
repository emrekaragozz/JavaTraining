package wardrobe;
//import clothes.Store; // Store.getClothes() is valid syntax

import static clothes.Store.*; //static import is implemented

public class Closet {
    public void borrow() {
        System.out.print("Borrowing clothes: "+ getClothes()); //to call getClothes()
    }
}
