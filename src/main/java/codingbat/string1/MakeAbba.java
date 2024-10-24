package codingbat.string1;

public class MakeAbba {
    public String makeAbba(String a, String b) {
        return a.concat(b).concat(b).concat(a);

    }

}
