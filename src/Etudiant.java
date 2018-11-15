public class Etudiant implements Comparable<Etudiant>{

    private final String name;
    private final String firstName;

    public Etudiant(String name, String firstName){
        this.name = name;
        this.firstName = firstName;
    }

    public String getName(){
        return name;
    }

    public String getFirstName(){
        return firstName;
    }

    @Override
    public String toString(){
        return firstName + " " + name;

    }

    @Override
    public int compareTo(Etudiant o){
        int res = name.compareTo(o.name);

        if(res == 0){
            res = firstName.compareTo(o.firstName);
        }

        return res;
    }

}

