package Lr7;


class StringHolder {
    private String str;

    public StringHolder(String str) {
        this.str = str;
    }


    @Override
    public String toString() {
        return "StringHolder{" +
                "str='" + str + '\'' +
                '}';
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}

class SubStringHolder extends StringHolder {
    private String str2;

    public SubStringHolder(String str) {
        super(str);
    }

    public SubStringHolder(String str, String str2) {
        super(str);
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "SubStringHolder{" +
                "str='" + getStr() + "', " +
                "str2='" + str2 + "'" +
                '}';
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        var holder = new StringHolder("holder");
        System.out.println(holder);
        var subHolder = new SubStringHolder("holder");
        System.out.println(subHolder);
        var subHolder2 = new SubStringHolder("holder", "subholder");
        System.out.println(subHolder2);
    }
}