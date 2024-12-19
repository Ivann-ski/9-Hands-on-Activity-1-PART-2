//========== PART 2 ===========//

public class Square extends Rectangle {
    @Override
    public void showDescription() {
        System.out.println("- has 4 equal sides");
        super.showDescription();
    }
}