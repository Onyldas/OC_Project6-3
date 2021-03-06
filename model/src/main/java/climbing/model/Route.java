package climbing.model;

import javax.persistence.*;

@Entity
public class Route {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne(targetEntity = Sector.class)
    @JoinColumn(name="id_sector")
    private Sector sector;
    @ManyToOne(targetEntity = Rating.class)
    @JoinColumn(name="id_rating")
    private Rating rating;
    private int nbSpits; // les splits sont des points d'ancrages sur la voie
    private int nbPitches; // les longueurs sont des "morceaux" de voie

    public Route(String name, Sector sector, Rating rating, int nbSpits, int nbPitches) {
        this.name = name;
        this.sector = sector;
        this.rating = rating;
        this.nbSpits = nbSpits;
        this.nbPitches = nbPitches;
    }

    public Route() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getNbSpits() {
        return nbSpits;
    }

    public void setNbSpits(int nbSpits) {
        this.nbSpits = nbSpits;
    }

    public int getNbPitches() {
        return nbPitches;
    }

    public void setNbPitches(int nbPitches) {
        this.nbPitches = nbPitches;
    }

    public void printRoute(){
        System.out.println();
        System.out.println("Voie : " + this.name + " id : " + this.id);
        System.out.println("Associé au secteur : " + this.sector.getName() );
        System.out.println("Notation : " + this.rating);
        System.out.println("Nombre de spits : " + this.nbSpits + " et Nombre de longueurs : " + this.nbPitches);
        System.out.println();
    }
}
