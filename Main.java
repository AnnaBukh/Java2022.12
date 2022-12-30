package HW_6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Noutbook noutbook_1 = new Noutbook();
        noutbook_1.setId(1536);
        noutbook_1.setProd("Lenovo");
        noutbook_1.setOzu(8);
        noutbook_1.setSsd(120);
        noutbook_1.setDiag(16);
        noutbook_1.setOperSystem("Windows");
        noutbook_1.setColor("Gray");
        //System.out.println(noutbook_1);

        Noutbook noutbook_2 = new Noutbook();
        noutbook_2.setId(1537);
        noutbook_2.setProd("Lenovo");
        noutbook_2.setOzu(16);
        noutbook_2.setSsd(256);
        noutbook_2.setDiag(18);
        noutbook_2.setOperSystem("Windows");
        noutbook_2.setColor("Gray");

        Noutbook noutbook_3 = new Noutbook();
        noutbook_3.setId(1538);
        noutbook_3.setProd("Samsung");
        noutbook_3.setOzu(16);
        noutbook_3.setSsd(256);
        noutbook_3.setDiag(18);
        noutbook_3.setOperSystem("Windows");
        noutbook_3.setColor("Black");

        Set<Noutbook> noutbooks = new HashSet<>();
        noutbooks.add(noutbook_1);
        noutbooks.add(noutbook_2);
        noutbooks.add(noutbook_3);
        //System.out.println(noutbooks);

        Noutbook FilterNoutbook = new Noutbook();

        System.out.println("По вашему запросу найдено: " + FilterNoutbook.filter(noutbooks));

        System.out.println(FilterNoutbook.newFilter(noutbooks));


       

    }
}
