public class Compare3
{
    public static Comparable largest(Comparable st1, Comparable st2) {
        if(st1.compareTo(st2) > 0) {
            return st1;
        }
        else {
            return st2;
        }
    }
}
