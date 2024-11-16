import java.util.ArrayList;
import java.util.List;

public class Supplier {

   public String id;
    public String name;
   public String contactInfo;
    public List<Fabric> suppliedFabrics = new ArrayList<>();


    void addFabric(Fabric fabric){
suppliedFabrics.add(fabric);
    }

    List<Fabric> getSuppliedFabrics(){
return suppliedFabrics;
    }
}
