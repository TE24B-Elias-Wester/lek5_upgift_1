
void main() {
    Bil B1 = new Bil("Ford", "Something", "ABC231", 1900, 100);

    IO.println(B1.toString());

    B1.oka_hast(50);
    B1.minska_hast(60);
    B1.oka_hast(120);

    try {
        B1.oka_hast(-10);
    } catch (IllegalArgumentException e) {
        IO.println("Error: " + e.getMessage());
    }

    try {
        
        Bil B2 = new Bil("", "", "111111", 0, 100);

    } catch (IllegalArgumentException e) {
        IO.println("Error: " + e.getMessage());
    }

}
