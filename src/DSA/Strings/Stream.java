package DSA.Strings;

public class Stream {
    public static void main(String[] args) {

        skip("","baccadh");
        System.out.println(skip("baccadh"));
    }

    static void skip(String p, String up){                    //processed and unprocessed strings

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch,up.substring(1));
        }
    }



    static String skip( String up){                    //processed and unprocessed strings

        if(up.isEmpty()){
            return " ";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
           return skip(up.substring(1));
        }
        else {
            return ch + skip(up.substring(1));
        }
    }
}
