public class Pokemon {

    String name;
    String type;
    String effectiveAgainst;


    public Pokemon(String name, String type, String effectiveAgainst) {
        this.name = name;
        this.type = type;
        this.effectiveAgainst = effectiveAgainst;
    }

    boolean isEffectiveAgainst(Pokemon anotherPokemon) {
       // System.out.println("nas pokemon "+ name + " proti "+effectiveAgainst);
        //System.out.println(anotherPokemon.type);

        return  this.effectiveAgainst.equals(anotherPokemon.type);
    }


}