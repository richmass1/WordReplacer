public class WordReplacer {
    public static String WordRep(String text, String target, String insert) {
for(int i = text.indexOf(target); i != -1; i = text.indexOf(target, i + 1)) {
text = text.substring(0, i) + insert + text.substring(i + target.length());
}
return text;
}
}