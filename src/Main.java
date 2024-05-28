//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s="Hello";
        String s2="Hello";
        String s3= new String("Hello");
        String s4= String.valueOf("Hello"); //can use any
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.isEmpty());

        ////interning in string
        System.out.println(s==s2);  //s,s2 same address
        System.out.println(s.equals(s2));
        System.out.println(s==s3);  //s,s3 diff address
        System.out.println(s.equals(s3));
        System.out.println(s==s4);  //s,s4 same address
        System.out.println(s.equals(s4));
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(s.compareTo("Cgo"));
        System.out.println(s.indexOf("el"));
        System.out.println(s.indexOf('h'));
        System.out.println(s.lastIndexOf('l'));

        String substr= s.substring(2,4);
        System.out.println(substr);

        String conc_str= s.concat("df");
        System.out.println(conc_str);

        System.out.println(s.contains("el")); //only takes charsequence

        String name = "Ju Ko Ki";
        name=name+'h';
        name=name+"jujji";
        name=90+30+name;
        name=name+90+40;

        System.out.println(name);
        char [] char_arr= name.toCharArray();
        for (char c: char_arr){
            System.out.println(c);
        }

        String [] split_str= name.split(" ");
        for(String e: split_str){
            System.out.println(e);
        }


        //Stringbulider
        StringBuilder ss= new StringBuilder("Ghhh");
        ss.append(8.88f); //can append everything
        System.out.println(ss);
        ss.deleteCharAt(2);
        ss.delete(3,5);
        System.out.println(ss);
        ss.insert(2,"hbuyh"); //insert anything
        System.out.println(ss);
        ss.setCharAt(2,'k');
        System.out.println(ss.indexOf("ju")); //only string
        System.out.println(ss);
        //reverse and substring,compareTo is also there
        ss.reverse();
        System.out.println(ss);


        //to convert string...toString() method



    }
}