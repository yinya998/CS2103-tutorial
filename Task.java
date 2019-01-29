
import java.util.*;

public class Task {
    public static final String DESCRIPTION_PREFIX = "description: ";
    //Constant names must be all uppercase using underscore to separate words.

    private String description;
    private boolean isImportant;
    //boolean should be in is-- form
    List<String> pastDescription = new ArrayList<>(); // a list of past descriptions

    public Task(String d) {
        this.description = d;
        if (!d.isEmpty())
            this.isImportant = true;
    }

    public String getAsXml() {
        return "<task>"+description+"</task>"; }
    //  Abbreviations and acronyms should not be uppercase when used as a part of a name.
    /**
     * Print the description as a string.
     */

    //name should be printDescription
    public void printDescription(){
        System.out.println(this); }


    @Override
    public String toString() {
        return DESCRIPTION_PREFIX + description; }
}