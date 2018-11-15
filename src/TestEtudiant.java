import java.util.*;

public class TestEtudiant {

    public static void main(String[] args){
        List<Etudiant> maListe = new ArrayList<>();
        maListe.add(new Etudiant( "Doe", "Jhon"));
        maListe.add(new Etudiant( "Doe", "Jane"));
        maListe.add(new Etudiant( "Abra", "Cadabra"));
        maListe.add(new Etudiant( "leroy", "Arthur"));

        Collections.sort(maListe);


        Collections.sort(maListe, (o1, o2) -> {
            int res = o1.getName().compareTo(o2.getName());

            if(res == 0){
                res = o1.getFirstName().compareTo(o2.getFirstName());
            }

            return res;
        });

       // System.out.println(maListe);

        List<String> chaines = Arrays.asList("Toto","titi","TUTU","aBc","aba");

        Collections.sort(chaines); //utilise comparTo naturel

        System.out.println(chaines);

        Collections.sort(chaines, String.CASE_INSENSITIVE_ORDER); //utilise le compar donné

        System.out.println(chaines);

    }

}
