package hw6;

// Class name must be same with the file name, Gift is changed with Q28.
public class Q28 {
    private Object contents; // final is removed, cannot assign a value to final variable contents
    protected Object getContents() {
        return contents; }
    protected void setContents(Object contents) {
        this.contents = contents;
    }
    public void showPresent() {
        System.out.print("Your gift: "+contents);
    }
    public static void main(String[] treats) {
        Q28 gift = new Q28();
        gift.setContents(gift);
        gift.showPresent();
    }
}