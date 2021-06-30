package bryandariolesmana.jwork_android;
/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

/**
 * insiasi class
 */
public class Location {
    private String province;
    private String description;
    private String city;
    /**
     * constructor untuk Location
     * @param province
     * @param city
     * @param description
     */
    public Location(String province, String city,String description ){
        this.province = province;
        this.city = city;
        this.description = description;
    }
    /**
     * akses provinsi dari Location
     * @return provinsi dari Location
     */
    public String getProvince(){
        return this.province;
    }
    /**
     * akses kota dari Location
     * @return kota dari Location
     */
    public String getCity(){
        return this.city;
    }
    /**
     * akses deskripsi dari Location
     * @return deskripsi dari Location
     */
    public String getDescription(){
        return this.description;
    }
    /**
     * akses provinsi dari Location
     * @return provinsi dari Location
     */
    public void setProvince(String province){
        this.province = province;
    }
    /** mutasi kota Location
     * @param city dari Location
     */
    public void setCity(String city){
        this.city = city;
    }
    /** mutasi deskripsi Location
     * @param description dari Location
     */
    public void setDescription(String description){
        this.description = description;
    }
}
