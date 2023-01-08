package Lr6;




class TextHolder {
    public char chr;
    public String str;

    public void set(char chr) {
        this.chr = chr;
    }

    public void set(String str) {
        this.str = str;
    }

    public void set(char[] chars) {
        if (chars.length == 1) chr = chars[0];
        else
            str = new String(chars);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        var holder = new TextHolder();
        holder.set('a');
        System.out.println(holder.chr);

        holder.set("Str");
        System.out.println(holder.str);

        holder.set(new char[]{'w'});
        System.out.println(holder.chr);

        holder.set(new char[]{'t', 'e', 'x', 't'});
        System.out.println(holder.str);
    }
}