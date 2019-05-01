package climbing.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Site {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    private String description;
    private String date;
    private String postalCode;
    private String municipality;
    private String adresse;
    @ManyToOne(targetEntity = Rating.class)
    @JoinColumn
    private Rating CotationMin;
    @ManyToOne(targetEntity = Rating.class)
    @JoinColumn
    private Rating CotationMax;
    @ManyToOne(targetEntity = Rating.class)
    @JoinColumn
    private Rating CotationMoyenne;
    private double altitude;
    @ManyToOne
    @JoinColumn(name="id_topo")
    private Topo topo;

    public Site(@NotNull String name, String description, String date, String postalCode, String municipality, String adresse, Rating cotationMin, Rating cotationMax, Rating cotationMoyenne, double altitude, Topo topo) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.postalCode = postalCode;
        this.municipality = municipality;
        this.adresse = adresse;
        this.CotationMin = cotationMin;
        this.CotationMax = cotationMax;
        this.CotationMoyenne = cotationMoyenne;
        this.altitude = altitude;
        this.topo = topo;
    }

    public Site() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Rating getCotationMin() {
        return CotationMin;
    }

    public void setCotationMin(Rating cotationMin) {
        CotationMin = cotationMin;
    }

    public Rating getCotationMax() {
        return CotationMax;
    }

    public void setCotationMax(Rating cotationMax) {
        CotationMax = cotationMax;
    }

    public Rating getCotationMoyenne() {
        return CotationMoyenne;
    }

    public void setCotationMoyenne(Rating cotationMoyenne) {
        CotationMoyenne = cotationMoyenne;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }
}
