public class Compare2
{
    public static Integer largest(Integer st1, Integer st2) {
        if(st1.compareTo(st2) > 0) {
            return st1;
        }
        else {
            return st2;
        }
    }
}
