public class new2 {
    public static void main(String[] args) {
        String text="In computer programming, a string is traditionally a sequence of characters, either as a literal constant or as some kind of variable. The latter may allow its elements to be mutated and the length changed, or it may be fixed (after creation). A string is generally considered as a data type and is often implemented as an array data structure of bytes (or words) that stores a sequence of elements, typically characters, using some character encoding. String may also denote more general arrays or other sequence (or list) data types and structures.";
        System.out.println(text.length());
        String yenitext="";
        for (int i=0; i < text.length() ; i++) {
            if (text.charAt(i)==' ') {
                yenitext= yenitext + "\n";
            }
            else {
                yenitext = yenitext + text.charAt(i);
            }
        }
        System.out.println(yenitext);
    }
}
