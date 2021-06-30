package bryandariolesmana.jwork_android;
/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */
public class Recruiter {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    /**
     * constructor Recruiter
     * @param id
     * @param name
     * @param email
     * @param phoneNumber
     * @param location
     */
    public Recruiter(int id,String name, String email, String phoneNumber,Location location){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    /**
     * akses id dari Recruiter
     * @return id dari Recruiter
     */
    public int getId(){
        return this.id;
    }
    /**
     * akses nama dari Recruiter
     * @return nama dari Recruiter
     */
    public String getName(){
        return this.name;
    }
    /**
     * akses email dari Recruiter
     * @return email dari Recruiter
     */
    public String getEmail(){
        return this.email;
    }
    /**
     * akses nomor ponsel dari Recruiter
     * @return nomor ponsel dari Recruiter
     */
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    /**
     * akses lokasi dari Recruiter
     * @return lokasi dari Recruiter
     */
    public Location getLocation(){
        return this.location;
    }
    /**
     * mutasi id dari Recruiter
     * @param id dari Recruiter
     */
    public void setId(int id){
        this.id = id;
    }
    /**
     * mutasi nama dari Recruiter
     * @param name dari Recruiter
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * mutasi email dari Recruiter
     * @param Email dari Recruiter
     */
    public void setEmail(String Email){
        this.email = email;
    }
    /**
     * mutasi nomor ponsel dari Recruiter
     * @param phoneNumber dari Recruiter
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    /**
     * mutasi location dari Recruiter
     * @param location dari Recruiter
     */
    public void setLocation(Location location){
        this.location = location;
    }
}
